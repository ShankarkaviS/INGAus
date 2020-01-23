package com.hcl.introduction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.introduction.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{

	
	@Query("select a FROM Account a")
   public List<Account> findByAcc();
	@Query("SELECT a FROM Account a WHERE a.custName=?1")
	public Account getCustName(String custName);
	
	@Query("SELECT a From Account a WHERE a.accountId>?1")
	public List<Account> getAccountCustomer(Long accountId);
	

	 @Query("SELECT a FROM Account a WHERE a.accountId>?1 OR a.place=?2 AND a.age>?3 order by a.age")
	 public List<Account> getAccountData(Long accountId,String place,Long age);
	 
	
	public List<Account> findByCustNameOrPlace(String custName,String place);

	 
}
