package com.itkr.fakeinsta.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itkr.fakeinsta.Utils;
import com.itkr.fakeinsta.model.UserVo;

@Service
public class UserService {
	
	@Autowired
	UserMapper mapper;
	
	public void join(UserVo vo) {
		//비밀번호 암호화
		String pw = vo.getUpw();
		String cryptoPw = Utils.sha256(pw);		
		vo.setUpw(cryptoPw);
		
		System.out.println("cryptoPw : " + cryptoPw);
		
		mapper.join(vo);
	}
	
	public int login(UserVo vo) { //0: 아이디없음, 1:로긴 성공, 2:비밀번호 틀림
		UserVo dbUser = mapper.getUser(vo);		
		if(dbUser == null) {
			return 0;
		}		
		
		String cryptoPw = Utils.sha256(vo.getUpw());		
		if(!cryptoPw.equals(dbUser.getUpw())) {
			return 2;
		} 
		
		return 1;
	}
}





