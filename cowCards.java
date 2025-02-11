import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n][m];
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                int[] row = new int[m];
                for (int j = 0; j < m; j++) {
                    row[j] = sc.nextInt();
                }
                Arrays.sort(row); // Keep the row in ascending order
                array[i] = row;

                // Check if the difference between all elements in the row is `n`
                for (int j = 1; j < m; j++) {
                    if (row[j] - row[j - 1] != n) {
                        flag = false;
                    }
                }
            }

            if (flag) {
                // Collect the first elements of each row along with their row indices
                int[][] firstElements = new int[n][2];
                for (int i = 0; i < n; i++) {
                    firstElements[i][0] = array[i][0]; // The first element
                    firstElements[i][1] = i + 1;      // Row index (1-based)
                }

                // Sort the rows based on the first element
                Arrays.sort(firstElements, (a, b) -> Integer.compare(a[0], b[0]));

                // Display the row indices in the order of sorted first elements
                for (int i = 0; i < n; i++) {
                    System.out.print(firstElements[i][1] + " ");
                }
                System.out.println();
            }
            else System.out.println(-1);
        }

        sc.close();
    }
}
