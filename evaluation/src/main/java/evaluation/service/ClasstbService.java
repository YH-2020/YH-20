package evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.ClasstbDao;
import evaluation.entity.Classtb;


@Service
public class ClasstbService {
	@Autowired
	private ClasstbDao classtbDao;
	
	
	public List<Classtb> getclass(){
		return classtbDao.getclass();
	}
}
