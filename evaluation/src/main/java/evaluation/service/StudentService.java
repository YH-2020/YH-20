package evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.StudentDao;
import evaluation.entity.Student;


@Service
public class StudentService {
	 @Autowired
	 private StudentDao studentDao;		
		public List<Student> getStus(){
			return studentDao.getStus();
		}	
	}
