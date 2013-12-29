package com.mitchellbosecke.pebble.controller;

import java.util.ArrayList;
import java.util.List;

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
		mav.addObject("tagList", getTagList());
		mav.addObject("filterList", getFilterList());
		mav.addObject("functionList", getFunctionList());
		mav.addObject("testList", getTestList());
		return mav;
	}

	@RequestMapping("/guide/{guideName}")
	public ModelAndView getGuide(@PathVariable("guideName") String guideName) {
		ModelAndView mav = getMav();
		mav.addObject("guideName", guideName);
		mav.setViewName("documentation/guides/" + guideName);
		return mav;
	}

	@RequestMapping("/{type}")
	public ModelAndView getComponentTypeReference(@PathVariable("type") String type) {
		ModelAndView mav = getMav();
		mav.setViewName("documentation/reference/componentTypeListing");

		mav.addObject("componentType", type);

		List<String> componentList = null;
		switch (type) {
			case "tag":
				componentList = getTagList();
				break;
			case "filter":
				componentList = getFilterList();
				break;
			case "function":
				componentList = getFunctionList();
				break;
			case "test":
				componentList = getTestList();
				break;
			case "operator":
				componentList = getOperatorList();
				break;

		}
		mav.addObject("componentList", componentList);
		return mav;
	}

	@RequestMapping("/{type}/{name}")
	public ModelAndView getComponentReference(@PathVariable("type") String type, @PathVariable("name") String name) {
		ModelAndView mav = getMav();
		StringBuilder templateName = new StringBuilder("documentation/reference/");
		mav.setViewName(templateName.append(type).append("/").append(name).toString());

		mav.addObject("componentType", type);
		mav.addObject("componentName", name);
		return mav;
	}

	private List<String> getTagList() {
		List<String> list = new ArrayList<>();
		list.add("block");
		list.add("extends");
		list.add("for");
		list.add("if");
		list.add("import");
		list.add("include");
		list.add("macro");
		list.add("set");
		return list;
	}

	private List<String> getFilterList() {
		List<String> list = new ArrayList<>();
		list.add("abbreviate");
		list.add("capitalize");
		list.add("date");
		list.add("default");
		list.add("escape");
		list.add("format");
		list.add("json");
		list.add("lower");
		list.add("number");
		list.add("trim");
		list.add("upper");
		list.add("urlencode");
		return list;
	}

	private List<String> getFunctionList() {
		List<String> list = new ArrayList<>();
		list.add("block");
		list.add("parent");
		return list;
	}

	private List<String> getTestList() {
		List<String> list = new ArrayList<>();
		list.add("empty");
		list.add("even");
		list.add("null");
		list.add("odd");
		list.add("iterable");
		return list;
	}
	
	private List<String> getOperatorList() {
		List<String> list = new ArrayList<>();
		list.add("is");
		list.add("math");
		list.add("logic");
		list.add("comparisons");
		list.add("others");
		return list;
	}

}
