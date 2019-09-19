package evaluation.dao;

import java.util.List;
import evaluation.entity.Faculty;

public interface FacultyDao {
	int addFaculty(Faculty faculty);
	int delFaculty(int facultyid);
	int updateFaculty(Faculty faculty);
	List<Faculty> getFaculty();
	int isFaculty(int facultyid);
	Faculty getFacultybyId(int facultyid);
	int isFacultybyname(String facultyname);
	int delchecked(String[] aa);
}
