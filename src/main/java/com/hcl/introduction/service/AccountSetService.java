package com.hcl.introduction.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.introduction.entity.Account;


public interface AccountSetService {
	List<Account> getAllAccount();

}
