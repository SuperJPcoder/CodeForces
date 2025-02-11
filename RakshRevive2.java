import java.util.Scanner;

public class RakhshStrengthener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the binary string
            int m = scanner.nextInt(); // Length of the interval to avoid being all weak
            int k = scanner.nextInt(); // Length of the segment Rostam can strengthen
            scanner.nextLine(); // Consume the newline character
            String s = scanner.nextLine(); // Binary string representing Rakhsh's spots

            char[] spots = s.toCharArray();
            int usesOfTimar = 0;

            for (int i = 0; i <= n - m;) {
                boolean allWeak = true;

                // Check if the interval of length m is entirely weak
                for (int j = 0; j < m; j++) {
                    if (spots[i + j] == '1') {
                        allWeak = false;
                        break;
                    }
                }

                if (allWeak) {
                    usesOfTimar++;
                    // Strengthen the segment of length k starting from i
                    for (int j = 0; j < k && i + j < n; j++) {
                        spots[i + j] = '1';
                    }
                    i += k; // Skip ahead by k spots
                } else {
                    i++; // Move to the next spot
                }
            }

            System.out.println(usesOfTimar);
        }

        scanner.close();
    }
}
