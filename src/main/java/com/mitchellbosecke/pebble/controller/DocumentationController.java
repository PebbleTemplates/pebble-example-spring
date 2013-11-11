package com.mitchellbosecke.pebble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/documentation")
public class DocumentationController extends BaseController {

	@RequestMapping()
	public ModelAndView getDocumentationIndex() {
		ModelAndView mav = getMav();
		mav.setViewName("documentation");
		return mav;
	}

	@RequestMapping("/guide/{guideName}")
	public ModelAndView getGuide(@PathVariable("guideName") String guideName) {
		ModelAndView mav = getMav();
		mav.setViewName("documentation/guides/" + guideName);
		return mav;
	}
	
	@RequestMapping("/{type}")
	public ModelAndView getComponentTypeReference(@PathVariable("type") String type) {
		ModelAndView mav = getMav();
		StringBuilder templateName = new StringBuilder("documentation/reference/");
		mav.setViewName(templateName.append(type).append("/").append(type).toString());
		return mav;
	}

	@RequestMapping("/{type}/{name}")
	public ModelAndView getComponentReference(@PathVariable("type") String type, @PathVariable("name") String name) {
		ModelAndView mav = getMav();
		StringBuilder templateName = new StringBuilder("documentation/reference/");
		mav.setViewName(templateName.append(type).append("/").append(name).toString());
		return mav;
	}

}
