import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}
