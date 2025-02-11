import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int answer = 0;
            for (int left = 0; left < n; left++) {
                if(a[left]>x)
                {
                    continue;
                }
                int presentToxicity = 0;
                for (int right = left; right < n; right++) {
                    presentToxicity += a[right];
                    if (presentToxicity > x) {
                        presentToxicity = 0;
                    }
                    else{
                    answer++;
                    }
                }
            }
            
            System.out.println(answer);
        }
        
        scanner.close();
    }
}
