import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); // Sort the array to simplify pair matching
            int score = 0;
            int left = 0, right = n - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == m) {
                    score++;
                    left++;
                    right--;
                } else if (sum < m) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
