import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> even = new ArrayList<>();
            int Lar_Odd = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even.add(arr[i]);
                } else {
                    Lar_Odd = Math.max(Lar_Odd, arr[i]);
                }
            }

            Collections.sort(even);

            int count = 0;
            if (Lar_Odd == Integer.MIN_VALUE) {
                System.out.println("0");
                continue;
            }

            while (!even.isEmpty()) {
                if (Lar_Odd > even.get(0)) {
                    int sum = Lar_Odd + even.get(0);
                    even.remove(0);
                    Lar_Odd = sum;
                    count++;
                } else {
                    Lar_Odd = Lar_Odd + even.get(0);
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
