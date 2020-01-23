package com.hcl.introduction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.introduction.entity.Account;
import com.hcl.introduction.repository.AccountRepository;

@Service
public class AccountSetServiceImpl implements AccountSetService {

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public List<Account> getAllAccount() {
	
		return accountRepository.findAll();
	}

}
