/**
 * 
 */
package com.hello.BootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.firstproject.pojo.Alien;

/**
 * @author USER
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(Alien alien) {
		System.out.println("Inside Home");
		ModelAndView mv = new ModelAndView();
		mv.addObject("aname", alien.getAid());
		mv.addObject("acolor", alien.getAcolor());
		mv.setViewName("Display");
		return mv;

	}
}
