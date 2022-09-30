import java.util.Scanner;
public class SavingsAccount {
	private static double a_i;
	private double s_b;
	public SavingsAccount() {
		s_b=0;
		a_i=0;
	}
	public SavingsAccount(double balance) {
		s_b=balance;
		a_i=0;
	}
	public void calculateMonthlyInterestRate() {
		System.out.println("current balance:"+s_b);
		double mi;
		mi=(s_b*a_i)/12;
		s_b=s_b+mi;
		System.out.println("new balance:"+s_b);
	}
	double getbalance() {
		return s_b;
	}
	static void modifyInterest(double new_interest) {
		a_i=new_interest;
	}

}

