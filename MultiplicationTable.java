public class MultiplicationTable {
    public static void main(String[] args) {
        // Outer loop for the multiplicands (1 to 10)
        for (int i = 1; i <= 10; i++) {
            // Inner loop for the multipliers (1 to 10)
            for (int j = 1; j <= 10; j++) {
                // Print the multiplication expression
                System.out.print(i + " * " + j + " = " + (i * j));

                // Add tab space for alignment
                System.out.print("\t");
            }
            // Move to the next line after completing one row
            System.out.println();
        }
    }
}
