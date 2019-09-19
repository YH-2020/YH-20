package evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import evaluation.entity.Teacher;
import evaluation.service.TeacherService;



@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
        
	 @RequestMapping("/login")
     public ModelAndView login() {
    	 ModelAndView mv=new ModelAndView("teacher/login");
    	 return mv;
}
	 
	 @RequestMapping("/managerlogin")
	 public ModelAndView  managerlogin(Model model,Teacher teacher){
		 model.addAttribute("teacher",teacher);
		 ModelAndView mv=new ModelAndView("teacher/managerlogin");
		 ModelAndView mv2=new ModelAndView("teacher/error");
		 boolean isLogin=teacherService.login(teacher.getTeachernumber(),teacher.getPassword());
		 if(isLogin) {
			 System.out.println("hello");
			 return mv;
		 }
		return mv2;
		
		
	 }
	 
}
