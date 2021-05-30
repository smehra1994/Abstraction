public class TestInterfaceClass {

	public static void main(String[] args) {
	
		//USBankInterface interface1=new USBankInterface();   //not allowed as we cant create objects of interface
		
		ICICIBankClass ic=new ICICIBankClass();
		ic.carLoan();
		ic.credit();
		ic.debit();
		ic.homeLoan();
		ic.Insurance();
		ic.mutualFunds();
		//icici class can use all the methods of both parents and hence this is the way to achieve multiple inheritance too
		
		System.out.println(USBankInterface.min_bal);

		//creating reference of interface with child class as we can't create its own object
		USBankInterface us=new ICICIBankClass();
		us.credit();
		us.debit();
		//can call methods under usbankineterface only not in icici class or other interface
		
	}

}
