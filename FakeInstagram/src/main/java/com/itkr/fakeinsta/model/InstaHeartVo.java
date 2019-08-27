package com.itkr.fakeinsta.model;

import org.apache.ibatis.type.Alias;
import lombok.Data;

@Data
@Alias("instaheart")
public class InstaHeartVo {
	private int i_insta;
	private int i_user;
	private String r_datetime;
}
