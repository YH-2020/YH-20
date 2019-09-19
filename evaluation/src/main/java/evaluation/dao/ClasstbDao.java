package evaluation.dao;

import java.util.List;

import evaluation.entity.Classtb;

public interface ClasstbDao {
	
	Classtb getClassById(int classid); 
	
	int addStudent(Classtb classtb);
	
	List<Classtb> getclass();
}
