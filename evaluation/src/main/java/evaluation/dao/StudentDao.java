package evaluation.dao;

import java.util.List;

import evaluation.entity.Student;



public interface StudentDao {
	List<Student> getStus();
	Student getStudentBystuid(int studentid);
	int updateStudent(Student student);
	int studentdel(int studentid);
	int studentall(String aa);
}
