package evaluation.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import evaluation.entity.Major;
import evaluation.service.MajorService;

import evaluation.entity.Teacher;
import evaluation.service.TeacherService;


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
	

	
	@Autowired
	private TeacherService teacherService;
	
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
	

	  

	
	 @RequestMapping("/managerlogin")
	 public ModelAndView  managerlogin(Model model,Teacher teacher){
		 model.addAttribute("teacher",teacher);
		 ModelAndView mv=new ModelAndView("manager/index");
		 ModelAndView mv2=new ModelAndView("manager/welcome");
		 boolean isLogin=teacherService.login(teacher.getTeachernumber(),teacher.getPassword());
		 if(isLogin) {
			 return mv;
		 }
		return mv2;
		
		
	 }
	
}
