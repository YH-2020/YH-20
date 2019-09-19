package evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.CourseDao;
import evaluation.entity.Course;

@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
	
	//查看Course
	public List<Course> getallcourse(){
		List<Course> list = courseDao.getallcourse();
		return list;
	}
	
	//新增
	public int addcourse(Course course) {
		int i = courseDao.addcourse(course);
		return i;
	}
	
	//修改
	public int updatecourse(Course course) {
		int i = courseDao.updatecourse(course);
		return i;
	}
	
	//根据id查询
	public List<Course> getidcourse (int courseid){
		List<Course> list = courseDao.getidcourse(courseid);
		return list;
	}
	
	//根据id删除
	public int byidcourse(int courseid) {
		int i=courseDao.byidcourse(courseid);
		return i;
	}
	
	//批量删除
	public int byincourse(String[] ids) {
		int i = courseDao.byincourse(ids);
		return i;
	}
	
	
	
	
	
}
