import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            int largestIndex = -1;
            int smallestIndex = -1;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > largest) {
                    largest = arr[i];
                    largestIndex = i;
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                    smallestIndex = i;
                }
            }

            if (largestIndex == 0 || smallestIndex == n - 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
