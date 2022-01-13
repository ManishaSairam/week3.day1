package assignment.day;

public class AxisBank extends BankInfo {
	
	public void deposit(int amt) {
		System.out.println("The amount deposited should always be "+amt);
	}
	
	public void deposit(int amt, String nominee) {
		System.out.println("The deposite account should have "+amt+ " and also a nominee like "+nominee);
	}

	public static void main(String[] args) {
		
		AxisBank dd = new AxisBank();
		
		dd.saving();
		dd.fixed();
		dd.deposit();
		
		dd.deposit(120);
		dd.deposit(1200, "My Name");

	}

}


