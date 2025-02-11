import java.util.Scanner;

public class DuplicateSequenceMultipleTestCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            // Read the input number for this test case
            int n = scanner.nextInt();
            
            // Check if the number is odd
            if (n % 2 != 0) {
                System.out.println("-1");
            } else {
                // Print the sequence (1, 1, 2, 2, ..., n/2, n/2) for even n
                for (int i = 1; i <= n / 2; i++) {
                    System.out.print(i + " " + i + " ");
                }
                System.out.println(); // Move to the next line for the next test case
            }
        }
        
        scanner.close();
    }
}
