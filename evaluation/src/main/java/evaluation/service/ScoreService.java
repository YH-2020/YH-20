package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.ScoreDao;
import evaluation.entity.Score;
@Service
public class ScoreService {
	@Autowired
	private ScoreDao scoreDao;
	public Score getScoreById(int scoreid) {
		return scoreDao.getScoreById(scoreid);
	}
	public int deleteScore(int scoreid) {
		return scoreDao.deleteScore(scoreid);
	}
	public int insertScore(Score score) {
		return scoreDao.insertScore(score);
	}
}
