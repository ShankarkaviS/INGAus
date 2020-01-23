package com.hcl.introduction.service;

import java.util.List;

import com.hcl.introduction.entity.Account;

public interface AccountService{
	
	public boolean create(Account account);
	public Account findByCustName(String custName);
	public List<Account> findByCustNameAndPlace(String custName,String place);
	public List<Account> getAccount();
	public List<Account> getAccountCustomer(Long accountId);
	public List<Account> getAccountData(Long accountId,String place,Long age);

}
