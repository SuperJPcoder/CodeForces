import java.util.Scanner;

public class MonumentHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            // Read the number of pillars
            int n = scanner.nextInt();
            int[] h = new int[n];
            
            // Read the heights of the pillars
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            
            // Initialize variables to track the largest group of consecutive pillars with the same height
            int maxGroupSize = 1;   // Max number of consecutive pillars with the same height
            int currentGroupSize = 1; // Current count of consecutive same-height pillars
            
            // Iterate through the heights array to find the largest group of identical heights
            for (int i = 1; i < n; i++) {
                if (h[i] == h[i - 1]) {
                    // If current height is the same as the previous, increment the current group size
                    currentGroupSize++;
                } else {
                    // If not, check if the current group size is the largest so far
                    if (currentGroupSize > maxGroupSize) {
                        maxGroupSize = currentGroupSize;
                    }
                    // Reset the current group size for the new height sequence
                    currentGroupSize = 1;
                }
            }
            
            // Final check in case the largest group is at the end of the array
            if (currentGroupSize > maxGroupSize) {
                maxGroupSize = currentGroupSize;
            }
            
            // Calculate the minimum operations needed to make heights non-decreasing
            int minOperations = n - maxGroupSize;
            
            // Output the result for this test case
            System.out.println(minOperations);
        }
        
        // Close the scanner
        scanner.close();
    }
}
