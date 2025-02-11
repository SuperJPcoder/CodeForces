import java.util.Scanner;

public class RakhshStrengthening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();

            int maincount = 0;
            int f = 0; // Current count of consecutive zeros
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    f++;
                } else {
                    f = 0;
                }

                if (f == m) {
                    maincount++;
                    f = 0; // Reset count
                    i += k - 1; // Skip the next k-1 indices
                }
            }
            System.out.println(maincount);
        }
    }
}
