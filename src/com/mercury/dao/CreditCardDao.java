package com.mercury.dao;

import java.util.List;

import com.mercury.beans.CreditCard;

public interface CreditCardDao {
	public void save(CreditCard creditcard);
	public List<CreditCard> queryAll();
	public void delete(CreditCard creditcard);
	public void update(CreditCard creditcard);
	public List<CreditCard> querybyuserid(int userId );
	public CreditCard querybyuseridandno(int userId, String cardNo);
	public CreditCard querybycardid(int cardId);
	
}
