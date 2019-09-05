package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.TeacherDao;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
		
}
