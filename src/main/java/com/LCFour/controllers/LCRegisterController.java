	package com.LCFour.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.LCFour.api.LCAppDTO;
import com.LCFour.api.LCContactDTO;
import com.LCFour.api.Phone;

@Controller
public class LCRegisterController {

	@Autowired
	public HttpServletRequest req;

	@RequestMapping("/register")
	public String registerPage(@ModelAttribute("lcInfo") LCAppDTO lcDTO) {
		System.out.println("inside register method");
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNumber("987654321");

		LCContactDTO contactDTO = new LCContactDTO();
		contactDTO.setPhone(phone);
		lcDTO.setContactDTO(contactDTO);
		return "register-page";
	}

	@RequestMapping(value = "/register-form", method = RequestMethod.POST)
	public String registerForm(@Valid @ModelAttribute("lcInfo") LCAppDTO lcDTO,BindingResult result) {
		System.out.println("inside register form method");
		System.out.println("Name |"+lcDTO.getName()+"|");
		if(result.hasErrors()) {
			System.out.println("has errors");
			List<ObjectError> objError=result.getAllErrors();
			for(ObjectError error:objError) {
				System.out.println(error);
			}
			return "register-page";
		}
		
		return "result-page";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {		
		System.out.println("Inside init binder");
		StringTrimmerEditor trimer=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", trimer);
//		binder.setDisallowedFields("name");
	}
}
