
public class Test {
	
	public static void main(String[] args) {
		BankAccount BA1 = new BankAccount(1000, 150);
		System.out.println("Back Account Balance = $" + BA1.getCurrBal() + " with Daily Withdrawal Limit of $" + BA1.getDailyLimit());
		
		InternetAccount IA1 = new InternetAccount(1000, 150, 3);
		System.out.println("Internet Account Balance  = $" + IA1.getCurrBal() + " with Daily Limit of $" + IA1.getDailyLimit() +
							" and Monthly Withdrawal Limit of " + IA1.getMonthlyLimit());
		
		InternetAccount IA2 = new InternetAccount(1500, 300, 10);
		System.out.println("Internet Account Balance  = $" + IA1.getCurrBal() + " with Daily Limit of $" + IA1.getDailyLimit() +
							" and Monthly Withdrawal Limit of " + IA1.getMonthlyLimit());
		
		
		BA1.withdrawal(1200);
		System.out.println("BA1 Current Balance = $" + BA1.getCurrBal());
		
		BA1.withdrawal(100);
		System.out.println("BA1 Current Balance = $" + BA1.getCurrBal());
		
		BA1.withdrawal(50);
		System.out.println("BA1 Current Balance = $" + BA1.getCurrBal());
		
		BA1.withdrawal(150);
		System.out.println("BA1 Current Balance = $" + BA1.getCurrBal());
		
		BA1.withdrawal(20);
		System.out.println("BA1 Current Balance = $" + BA1.getCurrBal());
		
		int index;
		int amount = 0;
		for(index = 0; index < 5; index++) {
			IA1.withdraw(amount = 10);
		}
		System.out.println("The internet balance, after " + index + " attempted withdrawals of $" + amount + " is " + IA1.getCurrBal());
		
		for (index = 0; index < 10; index++) {
			IA2.withdraw(amount = 35);
		}
		System.out.println("The internet balance, after " + index + " attempted withdrawals of $" + amount + " is " + IA2.getCurrBal());
	}

}
