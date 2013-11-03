package com.mitchellbosecke.pebble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/documentation")
public class DocumentationController extends BaseController {

	@RequestMapping()
	public ModelAndView getDocumentationIndex() {
		ModelAndView mav = getMav();
		mav.setViewName("documentation");
		return mav;
	}
	
	@RequestMapping("/installation")
	public ModelAndView getInstallation(){
		ModelAndView mav = getMav();
		mav.setViewName("documentation/installation");
		return mav;
	}
	
	@RequestMapping("/basic-usage")
	public ModelAndView getBasicUsage(){
		ModelAndView mav = getMav();
		mav.setViewName("documentation/basic-usage");
		return mav;
	}

}
