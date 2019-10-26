package com.jbc.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	public PageController() {
		System.out.println("created.../t"+this.getClass().getSimpleName());
	}
	
		@RequestMapping(value= {"/", "/home", "/index"})
		public ModelAndView index() {
			System.out.println("invoking index()");
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("greeting", "Wel Come to Spring WEB MVmvc");
			return mv;
		}

		/*@RequestMapping(value= "test")
		public ModelAndView test(@RequestParam(value="greeting", required= false)String greeting) {
			if(greeting == null) {
				greeting="hello world";
			}
			System.out.println("invoking index()");
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("greeting",greeting );
			return mv;
		}

		@RequestMapping("testing/{greeting}")
		public ModelAndView testPath(@PathVariable("greeting")String greeting) {
			//It is not working
			if(greeting == null) {
				greeting="hello world";
			}
			System.out.println("invoking index()");
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("greeting",greeting );
			return mv;
		}

	*/

}