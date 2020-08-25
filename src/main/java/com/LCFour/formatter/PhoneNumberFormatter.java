package com.LCFour.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.LCFour.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		return phone.getCountryCode() + "-" + phone.getPhoneNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		String[] phoneNmberArray = text.split("-");
		Phone phone = new Phone();

		int index = text.indexOf("-");
		if (index == -1 || index == 0) {
			phone.setCountryCode("91");
			phone.setPhoneNumber(phoneNmberArray[index + 1]);
		} else {
			phone.setCountryCode(phoneNmberArray[0]);
			phone.setPhoneNumber(phoneNmberArray[1]);
		}

		return phone;
	}

}