package com.hcl.introduction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.introduction.entity.Account;
import com.hcl.introduction.service.AccountService;

@RestController
public class AccountController {
	
	
	@Autowired
	AccountService accountService;

	
	  @PostMapping("/create") public String create(Account account) { boolean
	  b=accountService.create(account);
	  if(b==true)
		  return "Data Inserted Success";
	  
	  else
		  return "Data Inserted Failed";
	  
	  }
	  
	  @PostMapping("/getCustomer")
	  public Account findByCustomer(String customer) {
	  return accountService.findByCustName(customer); }
	 
	
	  @PostMapping("/getCustomerAndName")
	  public List<Account> findByCustomerAndPlace(String customer,String place)
	  {   
		  return accountService.findByCustNameAndPlace(customer, place); 
		  }
	 
	
	  
	  @PostMapping("/getCustomerAccount")
	  public List<Account> findByCustomerData() {
	  return accountService.getAccount();
	  }
	 

	  
	  @PostMapping("/getCustomerAccountId")
	  public List<Account> findByCustomerAccountId(Long accountId) {
	  return accountService.getAccountCustomer(accountId);
	  }
	 

	  @PostMapping("/getCustomerMultiple")
	  public List<Account> findByCustomerMultiple(Long accountId,String place,Long age) {
	  return accountService.getAccountData(accountId, place, age);
	  }
	  
	
	
}
