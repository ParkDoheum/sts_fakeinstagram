package com.itkr.fakeinsta.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itkr.fakeinsta.model.UserVo;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/join")
	public int join(@RequestBody UserVo vo) {
		System.out.println("uid : " + vo.getUid());
		System.out.println("upw : " + vo.getUpw());
		System.out.println("nick_nm : " + vo.getNick_nm());		
		service.join(vo);
		return 1;
	}
	
	@PostMapping("/login")
	public int login(@RequestBody UserVo vo) {				
		return service.login(vo);
	}
	
	
	@GetMapping("/test")
	public UserVo test() {
		UserVo vo = new UserVo();
		vo.setI_user(1);
		vo.setNick_nm("haha");
		return vo;
	}

}
