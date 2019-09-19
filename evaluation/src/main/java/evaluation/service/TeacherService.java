package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.TeacherDao;
import evaluation.entity.Teacher;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	
	public boolean login(String teachernumber,String password) {
		Teacher teacher=new Teacher();
		teacher.setTeachernumber(teachernumber);
		teacher.setPassword(password);
		Teacher t=teacherDao.getTeacher(teacher);
		if(t!=null){
			return true;
		}
		return false;
		}
		
}
