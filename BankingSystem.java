import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double balance = 0;
        double loanAmount = 0;
        String name = "";

        do {
            System.out.println("\n****************Welcome to the Banking System*****************");
            System.out.println("1. Create Account");
            System.out.println("2. Apply for Loan");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Print Account Data");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nCreate Account");
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // Consume newline character left by previous nextInt()
                    name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    balance = scanner.nextDouble();
                    // You can add more fields here like account number, etc.
                    System.out.println("Account created successfully for " + name);
                    break;

                case 2:
                    System.out.println("\nApply for Loan");
                    System.out.print("Enter loan amount: ");
                    loanAmount = scanner.nextDouble();
                    // You can add more fields here like loan duration, interest rate, etc.
                    System.out.println("Loan applied successfully!");
                    break;

                case 3:
                    System.out.println("\nWithdraw Money");
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;

                case 4:
                    System.out.println("\nCheck Balance");
                    System.out.println("Current Balance: " + balance);
                    break;

                case 5:
                    System.out.println("\n************Print Account Data************");
                    System.out.println();
                    System.out.println("Name:" + name);
                    System.out.println("Current Balance:" + balance);
                    System.out.println("Loan Amount: " + loanAmount);
                    // Print other relevant account data here
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }

        } while (option != 6);
    }
}
