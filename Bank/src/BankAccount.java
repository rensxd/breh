
public class BankAccount {

	private int accountNumber;
	private String ownerName;
	private int creditLevel;
	private int securityCode = 1337;

	public void withDraw(int code, int amount) {

		if (code == securityCode && amount > 0) {
			creditLevel -= amount;
		} else {
			System.out.println("Please fill in your correct securitycode or please withdraw a positieve amount");
		}

	}

	public void deposit(int amount) {

		if (amount > 0) {
			creditLevel += amount;
		} else {
			System.out.println("Please deposit a positive amount");
		}

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {

		if (accountNumber < 1000000) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("Accoutnumber has to be 6 figures");
		}

	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(int creditLevel) {
		this.creditLevel = creditLevel;
	}

}
