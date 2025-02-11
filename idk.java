import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            // Read the length of the arrays and integer k
            int length = scanner.nextInt();
            int k = scanner.nextInt();

            // Initialize arrays a and b
            int[] a = new int[length];
            int[] b = new int[length];

            // Read elements into array a
            for (int i = 0; i < length; i++) {
                a[i] = scanner.nextInt();
            }

            // Read elements into array b
            for (int i = 0; i < length; i++) {
                b[i] = scanner.nextInt();
            }

            // Initialize the score variable
            int score = 0;

            // Calculate the score based on the given logic
            while (k > length) {
                boolean allNonPositive = true;
                for (int i = 0; i < length; i++) {
                    score += a[i];
                    a[i] = a[i] - b[i];
                    if (a[i] > 0) {
                        allNonPositive = false;
                    }
                }
                if (allNonPositive) {
                    break;
                }
                k -= length;
            }

            // If k is not zero, sort the array and add the last k elements to the score
            if (k != 0) {
                Arrays.sort(a);
                for (int i = length - k; i < length; i++) {
                    score += a[i];
                }
            }

            // Display the final score
            System.out.println(score);
        }
        // Close the scanner
        scanner.close();
    }
}
