package evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.MajorDao;
import evaluation.entity.Major;

@Service
public class MajorService {
	@Autowired
	private MajorDao majorDao;
	public List<Major> getMajor(){
		return majorDao.getMajor();
	}
	public int deleteMajor(int majorid) {
		return majorDao.deleteMajor(majorid);
	}
	public int addMajor(Major major) {
		return majorDao.addMajor(major);
	}
	public int updateMajor(Major major) {
		return majorDao.updateMajor(major);
	}
	public Major getMajorById(int majorid) {
		return majorDao.getMajorById(majorid);
	}
}
