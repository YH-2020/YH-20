package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.FacultyDao;

@Service
public class FacultyService {
	@Autowired
	private FacultyDao facultyDao;
}
