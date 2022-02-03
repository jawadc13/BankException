import java.util.Scanner;
import java.math.*;

public class Withdraw {

	public static int WithdrawMoney(int total) throws BankWithdrawException {
		Scanner myWit = new Scanner(System.in);
		System.out.println("Press enter the amount you would like to withdraw: ");
		int withdrawTotal = myWit.nextInt();
		int checker = total - withdrawTotal;
		
		if(checker < 0) {
			throw new BankWithdrawException("You cannot withdraw more than the amount you have left. you exceeded: $"+Math.abs(checker));
		}
		else {
			return checker;
		}
		
	}
}
