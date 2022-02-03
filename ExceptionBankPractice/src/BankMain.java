import java.util.*;
public class BankMain {

	public static void main( String[] args ) {
		int total = 0;
		int decision = -1;
		while(decision != 0) {
			Scanner myNum = new Scanner(System.in);
			System.out.println("Welcome! You have a current total of $"+total+"\nPress 1 to deposit \nPress 2 to withdraw \nPress 0 to quit: ");
			decision = myNum.nextInt();
			
			if(decision == 1) {
				total = Deposit.DepositMoney(total);
			}
			else if(decision == 2) {
				 try {
					total = Withdraw.WithdrawMoney(total);
				} catch (BankWithdrawException e) {
					
					System.out.println(e.getMessage());
				}
			}
			else if(decision != 0) {
				System.out.println("Please enter a valid number");
				continue;
			}
			else {
				break;
			}
		}
		
	}
	
	
}
