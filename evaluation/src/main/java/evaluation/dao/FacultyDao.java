package evaluation.dao;

import java.util.List;

import evaluation.entity.Faculty;

public interface FacultyDao {
    
	//新增
	int addFaculty(Faculty faculty);
	//删除
	int delFaculty(int facultyid);
	//修改
	int updateFaculty(Faculty faculty);
	//查询所有
	List<Faculty> getFaculty();
	//根据id查询一组
	int isFaculty(int facultyid);
	//根据id查询
	Faculty getFacultybyId(int facultyid);
	//根据名字查询
	int isFacultybyname(String facultyname);
	//批量删除
	int delchecked(String[] ids1);




}
