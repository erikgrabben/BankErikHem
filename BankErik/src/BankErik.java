import java.util.Scanner;

public class BankErik {
    private static double balance = 10_000;

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter PIN");
    int pin = keyboard.nextInt();

	if (pin == 1111) {
	    System.out.println("Hello. Please enter 1 for withdrawal, 2 for deposit, 3 to display current balance.");
	    double choice = keyboard.nextInt();



	    if (choice == 1) {

	        withdraw(1200);

	    }

        else if (choice == 2) {
            deposite(2000);

        }

        else if (choice == 3) {
            System.out.println("Current balance: " + balance);

        }

    }

}

    private static void withdraw(double amount) {
        //System.out.println("Enter amount to withdraw: ");
        //int withdrawal = keyboard.nextInt();
        double resultWithdraw = balance - amount;
        if (resultWithdraw < 0 || amount > 2000) {
            System.out.println("Withdrawal cannot exceed $2000. Balance cannot be reduced below $0.");
        } else {
            System.out.println(amount + " has been withdrawn from your bank account.\nCurrent balance " + resultWithdraw + ".");
        }
    } private static void deposite (double amount) {
        //System.out.println("Enter amount to deposit");
        //double deposit = keyboard.nextInt();
        double resultDeposit = balance + amount;
        System.out.println("Deposit successful.\nCurrent balance: " + "$" + resultDeposit+ ".");
    }
}

