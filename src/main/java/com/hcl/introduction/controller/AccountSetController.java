package com.hcl.introduction.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.introduction.entity.Account;
import com.hcl.introduction.service.AccountSetService;

@RestController
public class AccountSetController {
	
	@Autowired
	AccountSetService accountSetService;

	@GetMapping("/getAllData")
	public List<Account> getAllAccount()
	{
		return accountSetService.getAllAccount();
	}

	
}
