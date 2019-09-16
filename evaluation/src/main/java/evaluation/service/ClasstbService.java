package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.ClasstbDao;

@Service
public class ClasstbService {
	@Autowired
	private ClasstbDao classtbDao;

}
