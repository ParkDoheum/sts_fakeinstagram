package com.itkr.fakeinsta.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.itkr.fakeinsta.model.UserVo;

@Mapper
@Repository
public interface UserMapper {
	public void join(UserVo vo);
	public UserVo getUser(UserVo vo);
}
