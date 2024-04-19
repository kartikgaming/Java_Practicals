public class FibonacciSeries {
    public static void main(String[] args) {
        int maxNumber = 78;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci series from 0 to " + maxNumber + ":");

        while (previousNumber <= maxNumber) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
