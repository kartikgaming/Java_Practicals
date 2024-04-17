import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
    
        System.out.println("Enter your choice:");
        System.out.println("1. Check if a number is even or odd.");
        System.out.println("2. Find the cube of a number between 1 and 50.");
        System.out.println("3. Calculate account balance based on principal amount and number of years.");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int num;
                System.out.print("Enter a number: ");
                num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
                break;
            case 2:
                int num2;
                System.out.print("Enter a number between 1 and 50: ");
                num2 = scanner.nextInt();
                if (num2 >= 1 && num2 <= 50) {
                    int cube = num2 * num2* num2;
                    System.out.println("Cube of " + num2 + " is " + cube);
                } else {
                    System.out.println("Number is out of range.");
                }
                break;
            case 3:
                double principalAmount;
                int numberOfYears;
                double accountBalance=0;
                System.out.print("Enter the principal amount: ");
                principalAmount = scanner.nextDouble();
                System.out.print("Enter the number of years: ");
                numberOfYears = scanner.nextInt();

                // Set interest rate based on age
                System.out.print("Enter your age:");
                int age=scanner.nextInt();
                System.out.print("Enter your gender 1.Male\n2.female");
                int gender=scanner.nextInt();

                if (age > 60) {
                    if(gender==1)
                    {
                        accountBalance = principalAmount * Math.pow((1 + (7/100)), numberOfYears);
                        System.out.println("Account balance after " + numberOfYears + " years: " + accountBalance);
                    }
                    else {
                        accountBalance = principalAmount * Math.pow((1 + (7.5/100)), numberOfYears);
                        System.out.println("Account balance after " + numberOfYears + " years: " + accountBalance);
                    }
                } //below 50
                else if(age < 50)
                {
                    accountBalance = principalAmount * Math.pow((1 + (5/100)), numberOfYears);
 
                }
                else
                {
                    System.out.print("Not eligible to recieve the roi" +accountBalance);
                }
                break;
            case 4:
                System.out.print("Enter a number: ");
                int num3 = scanner.nextInt();
        
                // Check if the number is positive, negative, or zero
                if (num3 > 0) {
                    System.out.println("The number is positive.");
                } else if (num3 < 0) {
                    System.out.println("The number is negative.");
                } else {
                    System.out.println("The number is zero.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
