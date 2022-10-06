package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	public AccountService(AccountRepository accRepo) {
		this.accRepo=accRepo;
		// TODO Auto-generated constructor stub
	}

	public void save()
	{
		AccountPK pk=new AccountPK();
		pk.setAccountId(103);
		pk.setAccountName("current");
		pk.setHolderName("uday");
		
		Account acc =new Account();
		acc.setBranchName("SBI");
		acc.setMinBal(10000.0);
		acc.setAccPK(pk);
		
		accRepo.save(acc);
		
		
	}
}
