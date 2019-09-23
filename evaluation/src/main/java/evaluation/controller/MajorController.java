package evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import evaluation.entity.Faculty;
import evaluation.entity.Major;
import evaluation.entity.ResultMsg;
import evaluation.service.FacultyService;
import evaluation.service.MajorService;

@Controller
@RequestMapping("/major")
public class MajorController {
	
	//注入service
	@Autowired
	private MajorService majorService;
	@Autowired
	private FacultyService facultyService;
	 
	//专业列表 查询所有专业信息
	@RequestMapping("/majorlist")
	public ModelAndView majorlist() {
		List<Major> majors=majorService.getMajor();
		ModelAndView mView=new ModelAndView("major/majorlist");
		mView.addObject("majors", majors);
		return mView;
	}
	
	//根据id删除
	@RequestMapping(value="/delmajor",produces= {"text/plain;charset=UTF-8"})
	@ResponseBody
	public ResultMsg delmajor(int majorid) {
		int i=majorService.deleteMajor(majorid);
		if (i>0) {
			return new ResultMsg(1,"删除专业信息成功");
		}else {
			return new ResultMsg(0,"删除专业信息失败");
		}
	}
	
	//新增页面
	@RequestMapping("/addmajor")
	public ModelAndView addmajor() {
		List<Faculty> faculty=facultyService.getFaculty();
		ModelAndView mView =new ModelAndView("major/addmajor");
		mView.addObject("faculty", faculty);
		return mView;
	}
	
	//新增提交
	@RequestMapping(value="/addmajor_submit",produces= {"text/plain;charset=UTF-8"})//produce设置响应格式编码
	@ResponseBody
	public ResultMsg addmajor_submit(int majorid,String majornumber,String majorname,int facultyid) {
		Major major=new Major();
		major.setMajorid(majorid);
		major.setMajornumber(majornumber);
		major.setMajorname(majorname);
		major.setFacultyid(facultyid);
		int i=majorService.addMajor(major);
		if (i>0) {
			return new ResultMsg(1, "添加专业成功");
		} else if(i==-2) {
			return new ResultMsg(2, "该专业已存在");
		}
		return new ResultMsg(0, "添加专业失败");
	}
	
	//修改页面
	@RequestMapping("/updatemajor")
	public ModelAndView updatemajor(int majorid) {
		Major major=majorService.getMajorById(majorid);
		List<Faculty> faculty=facultyService.getFaculty();
		ModelAndView mView =new ModelAndView("major/updatemajor");
		mView.addObject("major", major);
		mView.addObject("faculty",faculty);
		return mView;
	}
	
	//修改提交
	@RequestMapping(value="/updatemajor_submit",produces= {"text/plain;charset=UTF-8"})
	@ResponseBody
	public ResultMsg updatemajor_submit(Major major){
		//更新信息
		int i=majorService.updateMajor(major);
		if(i>0){
			return new ResultMsg(1,"修改专业信息成功");
		}else{
			return new ResultMsg(0,"修改专业信息失败");
		}
	}
	
	//批量删除
		@RequestMapping("delallmajor")
		@ResponseBody
		public ResultMsg delallmajor(String ids) {
			
			String[] majorids = ids.split(",");
			int i = majorService.delAllMajor(majorids);
			if(i>0) {
				return new ResultMsg(1, "删除成功");
			}else {
				return new ResultMsg(2, "删除 失败");
			}
		}

}
