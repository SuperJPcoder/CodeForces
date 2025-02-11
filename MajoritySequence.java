import java.util.ArrayList;
import java.util.Scanner;

public class MajoritySequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String input = scanner.next();
            System.out.println(canMakeOne(input) ? "Yes" : "No");
        }
        
        scanner.close();
    }

    private static boolean canMakeOne(String input) {
        ArrayList<Character> newArray = new ArrayList<>();
        int onesCount = 0;
        int zerosCount = 0;
        
        input += '1'; // Add extra '1' at the end
        int n = input.length();
        
        for (int i = 0; i < n - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            
            if (current == '1') {
                newArray.add(current);
                onesCount++;
            } else {
                if (next == '1') {
                    newArray.add(current);
                    zerosCount++;
                }
            }
        }
        
        return onesCount > zerosCount;
    }
}
