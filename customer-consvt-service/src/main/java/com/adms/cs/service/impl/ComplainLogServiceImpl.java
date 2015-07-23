package com.adms.cs.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.cs.dao.ComplainLogDao;
import com.adms.cs.service.ComplainLogService;
import com.adms.entity.cs.ComplainLog;

@Service("complainLogService")
@Transactional
public class ComplainLogServiceImpl implements ComplainLogService {

	@Autowired
	private ComplainLogDao answerDao;
	
	public ComplainLogServiceImpl() {
		
	}

	public void setComplainLogDao(ComplainLogDao answerDao) {
		this.answerDao = answerDao;
	}
	
	@Override
	public List<ComplainLog> findAll() throws Exception {
		return answerDao.findAll();
	}

	@Override
	public ComplainLog add(ComplainLog example, String userLogin) throws Exception {
		return answerDao.save(example);
	}
	
	@Override
	public ComplainLog update(ComplainLog example, String userLogin) throws Exception {
		return answerDao.save(example);
	}

	@Override
	public ComplainLog find(Long id) throws Exception {
		return answerDao.find(id);
	}
	
	@Override
	public List<ComplainLog> find(ComplainLog example) throws Exception {
		return answerDao.find(example);
	}
	
	@Override
	public List<ComplainLog> findByHql(String hql, Object...vals) throws Exception {
		return answerDao.findByHQL(hql, vals);
	}

	@Override
	public List<ComplainLog> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return answerDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<ComplainLog> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return answerDao.findByCriteria(detachedCriteria);
	}
	
}
