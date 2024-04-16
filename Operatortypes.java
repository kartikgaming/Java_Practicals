import java.util.Scanner;

public class Operatortypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 for arithmetic\n 2 for assignment\n 3 for bitwise\n 4 for logical\n 5 for ternary");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected arithmetic operator Addition");
                System.out.print("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                // int sum = num1 + num2;
                System.out.println("Addition result: " + num1+num2);
                System.out.println("Addition result: " + (num1-num2));
                System.out.println("Addition result: " + (num1*num2));
                System.out.println("Addition result: " + (num1/num2));
                System.out.println("Addition result: " + (num1%num2));
                break;
            case 2:
                System.out.println("You selected assignment operator Assignment:");
                int value;
                System.out.print("Enter the value to be assigned");
                value = sc.nextInt();
                System.out.println("Assigned value: " + value);
                value += 5;
                System.out.print("value is:" +value);
                value -= 5;
                System.out.println("Value is: " + value);
                break;
            case 3:
                System.out.println("You selected bitwise operator AND:");
                System.out.print("Enter two numbers num1 and num2: ");
                int num3 = sc.nextInt();
                int num4 = sc.nextInt();
                int result = num3 & num4;
                System.out.println("Bitwise AND result: " + result);
                result = num3 | num4;
                System.out.println("Bitwise OR result: "+result);
                result= num3^num4;
                System.out.println("Bitwise XOR result: "+result);
                break;
            case 4:
                System.out.println("You selected logical operator Logical AND:");
                boolean bool1 = true;
                boolean bool2 = false;
                boolean result2 = bool1 && bool2;
                System.out.println("Logical AND result: " + result2);
                result2 = bool1 || bool2;
                System.out.println("Logical OR result: " + result2);
                result2=!(bool1 || bool2);
                System.out.println("Logical NOT result: " + result2);
                break;
            case 5:
                System.out.println("You selected ternary operator (Check if positive or not):");
                System.out.print("Enter the number");
                int number = sc.nextInt();
                String result3 = (number >= 0) ? "Positive" : "Negative";
                System.out.println("Number is: " + result3);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}
