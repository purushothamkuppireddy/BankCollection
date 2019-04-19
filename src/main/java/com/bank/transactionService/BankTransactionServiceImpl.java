package com.bank.transactionService;

import com.bank.model.Account;
import com.bank.transactiondao.BankTransactionDaoImpl;

public class BankTransactionServiceImpl implements BankTransactionService{

	static BankTransactionDaoImpl transdao=new BankTransactionDaoImpl();
	
	
	public int withdraw(Account account,int amt) {
		int m=transdao.withdraw(account,amt);
		return m;
	}

	public int deposit(Account account,int amt) {
		int n=transdao.deposit(account,amt);
		return n;
	}

//	public int fundTransfer(Account account,long fromAccountNo, int amount, long toAccountNo,int amt) {
//		int k=transdao.fundTransfer(account,fromAccountNo,amount,toAccountNo,amt);
//		return k;
//	}

	public boolean validateAadhar(long aadharNo) {
		long n=aadharNo;
		
		if(Long.toString(n).length()==12)
			
			return true;	
		/*	
		int count=0;
		int rem=0;
		while(n>0)
		{
		 rem=(int) (n%10);
			n=n/10;
			count++;
		}
		if(count==12)*/
		
	else
		return false;
	}

}
