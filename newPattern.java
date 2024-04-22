public class newPattern{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
