import java.util.Calendar;

public class InternetAccount extends BankAccount {
	
	private int monthlyLimit;
	private int monthlyWithdrawn;
	
	public InternetAccount(int currBal, int dailyLimit, int monthlyLimit) {
		super(currBal, dailyLimit);
		this.monthlyLimit = monthlyLimit;
	}
	
	public void withdraw(int amount) {
		if (checkSameDay() == false) 
			setDailyWithdrawn(0);
		
		if (checkSameMonth() == false) 
			monthlyWithdrawn = 0;
		
		if (this.getCurrBal() > amount) {
			if (getDailyWithdrawn() + amount <= getDailyLimit() && monthlyWithdrawn < monthlyLimit) {
				setCurrBal(getCurrBal() - amount);
				setDailyWithdrawn(getDailyWithdrawn() + amount);
				monthlyWithdrawn += 1;
			}
		}	
	}

	public boolean checkSameMonth() {
		if (this.getCurrDate().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
				this.getCurrDate().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR))
			return true;
		else return false;
	}
	
	public int getMonthlyLimit() {
		return this.monthlyLimit;
	}
}
