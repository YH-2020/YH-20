package evaluation.dao;

import java.util.List;


import evaluation.entity.Major;

public interface MajorDao {
	List<Major> getMajor();
	int deleteMajor(int majorid);
	int addMajor(Major major);
	int updateMajor(Major major);
	Major getMajorById(int majorid);

}
