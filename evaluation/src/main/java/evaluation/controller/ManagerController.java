package evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import evaluation.entity.Major;
import evaluation.service.MajorService;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private MajorService majorService;
//	@RequestMapping("/majorlist")
//	public ModelAndView majorlist() {
//		List<Major> majors=majorService.getMajor();
//		ModelAndView mView=new ModelAndView("manager/majorlist");
//		mView.addObject("majors", majors);
//		return mView;
//	}
	@RequestMapping("/index")
	 public ModelAndView index() {
		 ModelAndView mv=new ModelAndView("manager/index");
		 return mv;
	 }
	
	@RequestMapping("/welcome")
	 public ModelAndView welcome() {
		 ModelAndView mv=new ModelAndView("manager/welcome");
		 return mv;
	 }
	@RequestMapping("/login")
	 public ModelAndView login() {
		 ModelAndView mv=new ModelAndView("manager/login");
		 return mv;
	 }
	
	  
	
}
