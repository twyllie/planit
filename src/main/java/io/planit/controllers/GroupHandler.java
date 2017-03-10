package io.planit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GroupHandler {

	
	
	@RequestMapping(value = "/group/<uid>", method = RequestMethod.GET)
	public String groupView(){
		return "single_group";
	}
}
