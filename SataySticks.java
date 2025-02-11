import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the number of elements
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int ctr;     // Counter for the number of swaps needed
            int ctr1;    // Counter for consecutive elements with difference of 1
            
            boolean reiterated;  // Flag to check if we need to reiterate
            
            do {
                ctr = 0;
                ctr1 = 0;
                reiterated = false;
                
                // Iterate through the array to check consecutive elements
                for (int i = 0; i < n - 1; i++) {
                    if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                        ctr1++;  // Increment ctr1 for consecutive elements with difference of 1
                        
                        // Check if elements are not in ascending order
                        if (arr[i] > arr[i + 1]) {
                            // Swap to make them ascending
                            int temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                            ctr++;     // Increment swap counter
                            reiterated = true;  // Set flag to reiterate
                        }
                    }
                }
            } while (reiterated);  // Continue until no more swaps are needed
            
            // Check the result conditions
            if (ctr1 == n - 1) {
                System.out.println("YES");
            } else {
                System.out.println(ctr == 0 ? "NO" : "REITERATE");
            }
        }
        
        scanner.close();
    }
}
