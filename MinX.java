import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int q = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            
            // Create prefix frequency arrays
            int[][] freq1 = new int[s1.length() + 1][26];
            int[][] freq2 = new int[s2.length() + 1][26];
            
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    freq1[i + 1][j] = freq1[i][j];
                }
                freq1[i + 1][s1.charAt(i) - 'a']++;
            }
            
            for (int i = 0; i < s2.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    freq2[i + 1][j] = freq2[i][j];
                }
                freq2[i + 1][s2.charAt(i) - 'a']++;
            }
            
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                int[] count1 = new int[26];
                int[] count2 = new int[26];
                
                for (int i = 0; i < 26; i++) {
                    count1[i] = freq1[r][i] - freq1[l - 1][i];
                    count2[i] = freq2[r][i] - freq2[l - 1][i];
                }
                
                int notFoundCounter = 0;
                for (int i = 0; i < 26; i++) {
                    if (count2[i] > count1[i]) {
                        notFoundCounter += count2[i] - count1[i];
                    }
                }
                
                System.out.println(notFoundCounter);
            }
        }
    }
}
