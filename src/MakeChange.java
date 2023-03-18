import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		//Scanner kb = new Scanner(System.in);

		makeCalculations();
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want to do another calculation. Type (Y/y) or (N/n)?");
		String calculateAgain = kb.next().toLowerCase();
		if (calculateAgain.equals("y")) {
			makeCalculations();
		}

		else {
			System.out.println("See you next time!");
		}

	}

	public static void makeCalculations() {
		// The following variables handle the change based on the cost of the items and
		// amount received from customer
		Scanner kb = new Scanner(System.in);
		
		double price;
		double customerPayment;
		double totalChange;

		// The following variable represent the amount a currency can go into a bill
		// using a whole number
		int billAmounts;

		// The following boolean represents a on/off button

		boolean stillOn = true;

		System.out.println("How much does the item(s) cost?: ");
		price = kb.nextDouble();
		System.out.println("How much money did the customer give you?: ");
		customerPayment = kb.nextDouble();
		totalChange = customerPayment - price;
		System.out.println(totalChange);
		while (stillOn = true) {

			if (totalChange < 0) {
				System.out.println("Error message: Sorry, but you do not have enough money");
				break;
			}

			else if (totalChange == 0) {
				System.out.println("Exact amount. No change needed!");
				break;
			}

			if (totalChange >= 20) {
				billAmounts = (int) (totalChange / 20);
				System.out.println(billAmounts + " Twenty Dollar Bill");
				totalChange = totalChange - (20 * billAmounts);
				continue;
			}

			if (totalChange >= 10) {
				billAmounts = (int) (totalChange / 10);
				System.out.println(billAmounts + " Ten Dollar Bill");
				totalChange = totalChange - (10 * billAmounts);
				continue;
			}

			if (totalChange >= 5) {
				billAmounts = (int) (totalChange / 5);
				System.out.println(billAmounts + " Five Dollar Bill");
				totalChange = totalChange - (5 * billAmounts);
				continue;
			}

			if (totalChange >= 1) {
				billAmounts = (int) (totalChange / 1);
				System.out.println(billAmounts + " One Dollar Bill");
				totalChange = totalChange - (1 * billAmounts);
				continue;
			}

			if (totalChange >= .25) {
				billAmounts = (int) (totalChange / .25);
				System.out.println(billAmounts + " Twenty-five cents");
				totalChange = totalChange - (.25 * billAmounts);
				continue;
			}

			if (totalChange >= .10) {
				billAmounts = (int) (totalChange / .10);
				System.out.println(billAmounts + " ten cents");
				totalChange = totalChange - (.10 * billAmounts);
				continue;
			}

			if (totalChange >= .05) {
				billAmounts = (int) (totalChange / .05);
				System.out.println(billAmounts + " five cents");
				totalChange = totalChange - (.05 * billAmounts);
				continue;
			}

			if (totalChange >= .01) {
				billAmounts = (int) (totalChange / .01);
				System.out.println(billAmounts + " cent(s)");
				totalChange = totalChange - (.01 * billAmounts);
				continue;

			}

			else {
				stillOn = false;
				break;
			}
		}

	}

}
