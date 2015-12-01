package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.CreditCard;

public class CreditCardDaoImpl implements CreditCardDao {
	private JdbcUtil util;
	
	public UserDaoImpl() {
		if (util==null) {
			util = new JdbcUtil();
		}
	}
	private HibernateTemplate template;
	private Session session;
	
	public void setSessionFactory (SessionFactory sessionFactory) {
		template = new HibernateTemplate (sessionFactory);
	}
	
	public Session getCurrentSession(){
		if(session==null)
			session = template.getSessionFactory().openSession();
		return session;
	}
	
	@Override
	public void save(CreditCard creditcard) {
		this.template.save(creditcard);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditCard> queryAll() {
		String hql = "from CreditCard";
		List<CreditCard> list = template.find(hql);
		return list;
	}

	@Override
	public void delete(CreditCard creditcard) {
		System.out.println(creditcard);
		this.template.delete(creditcard);
	}

	@Override
	public void update(CreditCard creditcard) {
		this.template.update(creditcard);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CreditCard> querybyuserid(int userId) {
		String hql = "from CreditCard cc where cc.user.userId=:userId";
		List<CreditCard> list = template.findByNamedParam(hql, "userId", userId);
		System.out.println(userId);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public CreditCard querybyuseridandno(int userId, String cardNo) {
		System.out.println("userId:" + userId + "cardNo:"+cardNo);
		String hql = "from CreditCard cc where cc.user.userId=:userId and cc.cardNo=:cardNo";
		Query query = getCurrentSession().createQuery(hql);
		query.setInteger("userId", userId);
		query.setString("cardNo", cardNo);
		List<CreditCard> lcc = query.list();
		CreditCard cc = null;
		if(lcc.size()>0){
			cc=lcc.get(0);
		}
		return cc;
	}
	@Override
	public CreditCard querybycardid(int cardId) {
		// TODO Auto-generated method stub
		String hql = "from CreditCard cc where cc.cardId=:cardId";
		List<CreditCard> list = template.findByNamedParam(hql, "cardId", cardId);
		if (list.size()<1){
			return null;
		}
		return list.get(0);
	}

}
