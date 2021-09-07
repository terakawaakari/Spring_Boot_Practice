package com.example.demo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
	@RequestMapping("/thymeleaf")
	public ModelAndView thmeleaf(ModelAndView mav) {
		mav.addObject("user_id", 999);
		mav.setViewName("thymeleaf/howto");
		return mav;
	}
}
