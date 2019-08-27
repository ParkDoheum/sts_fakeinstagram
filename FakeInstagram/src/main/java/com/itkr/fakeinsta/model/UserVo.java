package com.itkr.fakeinsta.model;

import org.apache.ibatis.type.Alias;
import lombok.Data;

@Data
@Alias("user")
public class UserVo {
	private int i_user;
	private String uid;
	private String upw;
	private String nick_nm;
	private String profile_img;
	private String r_datetime;
}
