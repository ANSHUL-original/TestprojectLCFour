package com.LCFour.api;

import java.util.Arrays;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.LCFour.validator.Age;
import com.LCFour.validator.Pass;

public class LCAppDTO {
	
	@NotEmpty(message = "*cant be Empty")
	private String name;
	@NotBlank(message = "*username cant be blank")
	@Size(min = 3, max = 15, message = "*User name should have character in between 3-15")
	private String userName="eg. jhon123";
	@Pass
	private String password;
	private String country;
	private String[] hobby;
	private String gender;
	@Age
	private Integer age;

	private LCContactDTO contactDTO;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LCContactDTO getContactDTO() {
		return contactDTO;
	}

	public void setContactDTO(LCContactDTO contactDTO) {
		this.contactDTO = contactDTO;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", userName=" + userName + ", password=" + password
				+ ", country=" + country + ", hobby=" + Arrays.toString(hobby) + ", gender=" + gender + ", contactDTO="
				+ contactDTO+", age="+age;
	}

}