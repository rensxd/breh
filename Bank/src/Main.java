
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankaccount = new BankAccount();

		bankaccount.setAccountNumber(555);
		bankaccount.setCreditLevel(20);
		bankaccount.setOwnerName("Rens");
		bankaccount.deposit(30);
		bankaccount.withDraw(1337, 15);

		System.out.println(bankaccount.getCreditLevel());
	}

}
