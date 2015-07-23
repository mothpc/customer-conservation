package com.adms.cs.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.entity.cs.ComplainLog;

public interface ComplainLogService {

	public ComplainLog add(ComplainLog example, String userLogin) throws Exception;

	public ComplainLog update(ComplainLog example, String userLogin) throws Exception;

	public List<ComplainLog> findAll() throws Exception;
	
	public ComplainLog find(Long id) throws Exception;
	
	public List<ComplainLog> find(ComplainLog example) throws Exception;

	public List<ComplainLog> findByHql(String hql, Object...vals) throws Exception;

	public List<ComplainLog> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<ComplainLog> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
