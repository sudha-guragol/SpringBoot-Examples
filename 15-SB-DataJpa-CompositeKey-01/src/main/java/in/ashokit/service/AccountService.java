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
		/*AccountPK pk=new AccountPK();
		pk.setAccountId(101);
		pk.setAccountName("Savings");
		pk.setHolderName("salman");*/
		
		Account acc =new Account();
		acc.setBranchName("SBI");
		acc.setMinBal(10000.0);
		acc.setAccountId(103);
		acc.setAccountName("SAVINGS");
		acc.setHolderName("AMAN");
		
		accRepo.save(acc);
		
		
	}
}
