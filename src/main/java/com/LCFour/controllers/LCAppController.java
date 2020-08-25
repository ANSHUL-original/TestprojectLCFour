package com.LCFour.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LCFour.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String homePage(@ModelAttribute("usrInfo") UserInfoDTO usrDTO) {
		usrDTO.setUserName("eg. jhon123");
		return "home-page";
	}

	@RequestMapping(value = "/login-form")
	public String loginPage(@Valid @ModelAttribute("usrInfo") UserInfoDTO usrDTO, BindingResult result) {

		System.out.println(usrDTO.isTermAndCondition());
		if (result.hasErrors()) {
			usrDTO.setUserName("eg. jhon123");
			return "home-page";
		}

		return "result-page";
	}

	@InitBinder
	public void intiBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
//		CustomDateEditor dateEditor=new CustomDateEditor(dateFormat, false);
		
//		CustomNumberEditor numberEditor=new CustomNumberEditor("##,###.00", false);
		
	}
	
}
