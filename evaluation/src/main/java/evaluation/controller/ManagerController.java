package evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import evaluation.entity.Teacher;
import evaluation.service.TeacherService;


@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	 //注入service
	@Autowired
	private TeacherService teacherService;
	
	 //主页面
	@RequestMapping("/index")
	 public ModelAndView index() {
		 ModelAndView mv=new ModelAndView("manager/index");
		 return mv;
	 }
	
	 //欢迎页面
	@RequestMapping("/welcome")
	 public ModelAndView welcome() {
		 ModelAndView mv=new ModelAndView("manager/welcome");
		 return mv;
	 }
	
	 //登录页面
	@RequestMapping("/login")
	 public ModelAndView login() {
		 ModelAndView mv=new ModelAndView("manager/login");
		 return mv;
	 }
	
	 //登录判断
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
