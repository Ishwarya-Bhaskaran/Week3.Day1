package Week3.Assignments;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposit 10% interest");
	}
	public static void main (String[] args)
	{
		AxisBank axis= new AxisBank();
		axis.deposit();
	}
}
