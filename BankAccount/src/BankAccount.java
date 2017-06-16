import java.util.Calendar;

/**
 * Class for BankAccount
 * 
 * @author connormcleod
 *
 */
public class BankAccount {

	private int currBal;
	private int dailyLimit;
	private int dailyWithdrawn;
	private Calendar currDate;

	/**
	 * Constructor for BankAccount
	 */
	public BankAccount(int currBal, int dailyLimit) {
		this.currBal = currBal;
		this.dailyLimit = dailyLimit;
		this.currDate = Calendar.getInstance();
	}

	/**
	 * Perform a bank deposit
	 * 
	 * @param amount = dollar amount to be deposited
	 * @pre: amount > 0
	 * @post: current balance increases by amount if valid deposit value
	 */
	public void deposit(int amount) {
		currBal = currBal + amount;
		System.out.println("New Balance = $" + getCurrBal());
	}

	/**
	 * Perform a bank withdrawal
	 * 
	 * @param amount = dollar amount requested for withdrawal
	 * @pre: amount > 0
	 * @post: currrent balance decreases by amount if valid withdrawal value
	 */
	public void withdrawal(int amount) {
		if (checkSameDay() == false) {
			setDailyWithdrawn(0);
		}
		if (this.currBal >= amount) {
			if (getDailyWithdrawn() + amount <= dailyLimit) {
				currBal -= amount;
				setDailyWithdrawn(getDailyWithdrawn() + amount);
				System.out.println("Withdraw $" + amount);
			}
			else System.out.println("Withdrawal of $" + amount + " exceeds daily limit of $" + dailyLimit);
		} else System.out.println("Insufficient Funds to withdraw $" + amount);
	}

	/**
	 * Function to determine if the date of interest is the same as the current date
	 * @return true if it is the same day, otherwise false
	 */
	public boolean checkSameDay() {
		if (this.currDate.get(Calendar.DAY_OF_YEAR) == Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
				&& (this.currDate.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)))
			return true;
		else
			return false;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////GETTERS AND SETTERS///////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	/**
	 * Getter for the current balance
	 * 
	 * @return current balance of associated Bank Account
	 */
	public int getCurrBal() {
		return this.currBal;
	}
	
	/**
	 * Set the Current Balance
	 * @param currBal: current balance of Bank Account
	 */
	public void setCurrBal(int currBal) {
		this.currBal = currBal;
	}

	/**
	 * Getter for remaining daily limit
	 * @return remaining daily limit for associated Bank Account
	 */
	public int getDailyLimit() {
		return this.dailyLimit;
	}
	
	/**
	 * Getter for current date
	 * @return current date
	 */
	public Calendar getCurrDate() {
		return this.currDate;
	}

	/**
	 * Return the value of amount(s) withdrawn from bank account today 
	 * @return: amount withdrawn today
	 */
	public int getDailyWithdrawn() {
		return dailyWithdrawn;
	}

	/**
	 * Set the value of amount(s) withdrawn from bank account today
	 * @param dailyWithdrawn: amount withdrawn today
	 */
	public void setDailyWithdrawn(int dailyWithdrawn) {
		this.dailyWithdrawn = dailyWithdrawn;
	}
}
