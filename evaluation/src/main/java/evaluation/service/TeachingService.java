package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.TeachingDao;

@Service
public class TeachingService {
	@Autowired
	private TeachingDao teachingDao;
}
