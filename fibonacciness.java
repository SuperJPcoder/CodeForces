import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int sum1 = a + b;
            int sum2 = c - b;
            int sum3 = d - c;

            if (sum1 == sum2 && sum2 == sum3) {
                System.out.println(3);
            } else if (sum1 == sum2 || sum2 == sum3 || sum1 == sum3) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }

        sc.close();
    }
}
