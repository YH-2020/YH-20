package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.CourseDao;

@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
}
