package evaluation.dao;

import evaluation.entity.Score;

public interface ScoreDao {
	Score getScoreById(int scoreid);
	int deleteScore(int scoreid);
	int insertScore(Score score);

}
