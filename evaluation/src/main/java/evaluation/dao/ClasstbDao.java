package evaluation.dao;

import evaluation.entity.Classtb;

public interface ClasstbDao {
	
	Classtb getClassById(int classid); 
	
	int addStudent(Classtb classtb);

}
