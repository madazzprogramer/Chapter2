import java.util.Scanner;
public class Addition {

public static void main(String[] args) {

	Scanner input = new Scanner (System.in);

	System.out.print("Enter amount:");

	int balance1 = input.nextInt();

	System.out.print("Enter current balance:");

	int balance2 = input.nextInt();

	int Balance = balance1 + balance2;

	System.out.printf("Balance is %d%n", Balance);
	
 }

}
