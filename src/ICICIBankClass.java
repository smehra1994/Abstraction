public class ICICIBankClass implements RBIBankInterface, USBankInterface {

	// all methods of both interfaces getting overridden-method overrriding
	@Override
	public void loan() {
		System.out.println("Loan for me");
	}

	@Override
	public void homeLoan() {
		System.out.println("Home Loan for me");
	}

	@Override
	public void carLoan() {
		System.out.println("Car Loan for me");
	}

	@Override
	public void debit() {
		System.out.println("Loan for me-debit");
	}

	@Override
	public void credit() {
		System.out.println("Loan for me-credit");
	}

	@Override
	public void transferMoney() {
		System.out.println("Loan for me-transfer");
	}

	// icici own non overridden methods

	public void mutualFunds()

	{
		System.out.println("icici-mutual funds");
	}
	
	public void Insurance()

	{
		System.out.println("icici-insurance");
	}
}
