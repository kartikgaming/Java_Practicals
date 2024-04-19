import java.util.Scanner;

public class EvenNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int minVal = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int maxVal = scanner.nextInt();

        System.out.println("Even numbers between " + minVal + " and " + maxVal + " are:");
        for (int i = minVal; i <= maxVal; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
