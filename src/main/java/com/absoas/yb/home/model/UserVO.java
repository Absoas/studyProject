package com.absoas.yb.home.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserVO implements Serializable{
	
	private String user_id;
	private String user_pass;
	private String user_name;
	
}
