import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid input! Please enter a 3-digit number.");
        } else {
            int originalNumber = number;
            int result = 0;

            while (number != 0) {
                int digit = number % 10;
                result += Math.pow(digit, 3);
                number /= 10;
            }

            if (result == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }

        scanner.close();
    }
}
