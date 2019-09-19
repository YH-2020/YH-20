package evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.FacultyDao;
import evaluation.entity.Faculty;

@Service
public class FacultyService {
	@Autowired
	private FacultyDao facultyDao;
	public List<Faculty> getFaculty(){
		return facultyDao.getFaculty();
	}

}
