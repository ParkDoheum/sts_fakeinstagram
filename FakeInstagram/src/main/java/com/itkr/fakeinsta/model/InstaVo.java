package com.itkr.fakeinsta.model;

import org.apache.ibatis.type.Alias;
import lombok.Data;

@Data
@Alias("insta")
public class InstaVo {
	private int i_insta;
	private int write_uid;
	private String img;
	private String r_datetime;
}
