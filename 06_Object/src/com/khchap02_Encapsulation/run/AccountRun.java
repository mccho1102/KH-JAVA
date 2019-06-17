package com.khchap02_Encapsulation.run;

import com.khchap02_Encapsulation.model.Account;

public class AccountRun {
    public static void main(String[] args) {
		Account ac = new Account();
		
		ac.displayBalance();
		ac.deposit(1000);
		
		//ac.deposit(1000000);
		//ac.deposit(5000);
		//ac.deposit(2000);
		//ac.deposit(-1000);
		
		int result = ac.withdraw();
		
		if(result != -1) {
		     System.out.println("출금 후 잔액 : " + result);
	    }
		
        result = ac.withdraw();
		
		if(result != -1) {
		     System.out.println("출금 후 잔액 : " + result);
	    }
    }
   
}
