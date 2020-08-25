package com.LCFour.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "*UserName can be empty")
	@Size(min = 3,max = 15,message = "*username should be of 3-15 characters")
	private String userName;

	@NotBlank(message = "*CrushName can be empty")
	@Size(min = 3,max = 15,message = "*CrushName should be of 3-15 characters")
	private String crushName;
	
	
	@AssertTrue(message = "*check to agree T&C")
	private boolean termAndCondition;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}
	
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	
}
