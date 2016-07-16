package com.longyun.pojo;

import java.io.Serializable;

public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3451934335545L;
	
	
	
	private String userName;
	
	private String userId;
	
	private String nickName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	

	
}
