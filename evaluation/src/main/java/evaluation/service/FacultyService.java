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
	
	public int insertFaculty(Faculty faculty) {
		int cnt=facultyDao.isFacultybyname(faculty.getFacultyname());
    	if(cnt>0){
			return -2;
		}
		int i= facultyDao.addFaculty(faculty);
		return i;
	}
	
	public int delFaculty(int facultyid) {
		return facultyDao.delFaculty(facultyid);
	}
	
	public int delchecked(String[] aa) {
		return facultyDao.delchecked(aa);
	}
	
	public int updateFaculty(Faculty faculty){
		int cnt=facultyDao.isFacultybyname(faculty.getFacultyname());
    	if(cnt>0){
			return -2;
		}
		int i= facultyDao.updateFaculty(faculty);
		return i;
	}
	
	public List<Faculty> getFaculty() {
		return facultyDao.getFaculty();
	}
	
	public Faculty getFacultybyId(int facultyid) {
		return facultyDao.getFacultybyId(facultyid);
	}
	
	
}
