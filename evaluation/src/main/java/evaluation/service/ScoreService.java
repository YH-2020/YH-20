package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.ScoreDao;
@Service
public class ScoreService {
	@Autowired
	private ScoreDao scoreDao;
}
