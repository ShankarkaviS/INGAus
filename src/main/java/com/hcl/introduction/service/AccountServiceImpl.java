package com.hcl.introduction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.introduction.entity.Account;
import com.hcl.introduction.entity.Student;
import com.hcl.introduction.repository.AccountRepository;
import com.hcl.introduction.repository.StudentRepository;

@Service
public class AccountServiceImpl implements AccountService, StudentService {
	
	@Autowired
	AccountRepository accountRepository;

	@Autowired
	StudentRepository studentRepository;
	
	  @Override public boolean create(Account account) {
	  
	  
	  Account acc= accountRepository.save(account);
	  if(acc.getAccountId()>0) 
		  return true;
	  else return false; }
	 
	
	  @Override public Account findByCustName(String custName) {
	  
	  return accountRepository.getCustName(custName); }
	 
	
	 @Override public List<Account> findByCustNameAndPlace(String custName, String place) {
	  
	  return accountRepository.findByCustNameOrPlace(custName, place); }


	@Override
	public List<Account> getAccount() {
		
		return accountRepository.findByAcc();
	}


	@Override
	public List<Account> getAccountCustomer(Long accountId) {
		
		return accountRepository.getAccountCustomer(accountId);
	}


	@Override
	public List<Account> getAccountData(Long accountId, String place, Long age) {
		
		return accountRepository.getAccountData(accountId, place, age);
	}


	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}


	
	

	
}
