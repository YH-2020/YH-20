package evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import evaluation.dao.MajorDao;

@Service
public class MajorService {
	@Autowired
	private MajorDao majorDao;
}
