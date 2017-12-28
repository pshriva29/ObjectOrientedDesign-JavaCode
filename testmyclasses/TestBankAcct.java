package testmyclasses;

import myclasses.ChkgAcct;
import myclasses.ChkgAcct2;
import myclasses.SvgsAcct;
import myclasses.SvgsAcct2;

public class TestBankAcct
{

	public static void main(String[] args)
	{  
		SvgsAcct s = new SvgsAcct(111,300.00);
		ChkgAcct c = new ChkgAcct(222,500.00);
		ChkgAcct c1 = new ChkgAcct(333,600.00);
		
		System.out.println("Beginning balances:");
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		
		//Deposit and Withdraw
		
		s.deposit(100.00);
	    s.withdraw(250.00);
		
	   c.deposit(150.00);
	   c.withdraw(100.00);
	  c.withdraw(200.00);
	    
	    c1.deposit(100.00);
	   c1.deposit(150.00);
	   c1.withdraw(50.00);
	    
		s.monthEnd();
		c.monthEnd();
		c1.monthEnd();
		
		System.out.println("End of month 1:");
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		
		//updating values for interest rate,monthly fee and per check fee
		SvgsAcct.setInterestRate(.05);
		ChkgAcct.setMonthlyFee(5.00);
		ChkgAcct.setPerCheckFee(.18);
		
		s.deposit(750.00);
		s.withdraw(400.00);
		s.withdraw(50.00);
		s.withdraw(100.00);
		
		c.deposit(300.00);
		c.withdraw(50.00);
		c.withdraw(60.00);
		c.withdraw(70.00);
		
		c1.withdraw(10.00);
		
		s.monthEnd();
		c.monthEnd();
		c1.monthEnd();
		
		System.out.println("End of month 2:");
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		
		
		SvgsAcct2 s2 = new SvgsAcct2(111,300.00);
		ChkgAcct2 c2 = new ChkgAcct2(222,500.00);
		ChkgAcct2 c3 = new ChkgAcct2(333,600.00);
		
		System.out.println("Beginning balances:");
		System.out.println(s2.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		
		//Deposit and Withdraw
		
		s2.deposit(100.00);
	    s2.withdraw(250.00);
		
	   c2.deposit(150.00);
	   c2.withdraw(100.00);
	  c2.withdraw(200.00);
	    
	    c3.deposit(100.00);
	   c3.deposit(150.00);
	   c3.withdraw(50.00);
	    
		s2.monthEnd();
		c2.monthEnd();
		c3.monthEnd();
		
		System.out.println("End of month 1:");
		System.out.println(s2.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		
		//updating values for interest rate,monthly fee and per check fee
		SvgsAcct2.setInterestRate(.05);
		ChkgAcct2.setMonthlyFee(5.00);
		ChkgAcct2.setPerCheckFee(.18);
		
		s2.deposit(750.00);
		s2.withdraw(400.00);
		s2.withdraw(50.00);
		s2.withdraw(100.00);
		
		c2.deposit(300.00);
		c2.withdraw(50.00);
		c2.withdraw(60.00);
		c2.withdraw(70.00);
		
		c3.withdraw(10.00);
		
		s2.monthEnd();
		c2.monthEnd();
		c3.monthEnd();
		
		System.out.println("End of month 2:");
		System.out.println(s2.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
     }

}
