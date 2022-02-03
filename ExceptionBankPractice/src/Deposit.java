import java.util.Scanner;

public class Deposit {

	public static int DepositMoney(int total) {
		
		Scanner myDep = new Scanner(System.in);
		System.out.println("Press enter the amount you would like to deposit: ");
		int depositTotal = myDep.nextInt();
		if(depositTotal < 0) {
			System.out.println("Error: Press enter a valid deposit number (No negative values)");
			return total;
		}
		total = total + depositTotal;
		return total;
		
	}
}
