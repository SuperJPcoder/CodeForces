import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            if (n == 1) {
                System.out.println(0);
            } else if (n <= k) {
                System.out.println(1);
            } else {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(1);
                }
                int result = mergeElements(list, k);
                System.out.println(result);
            }
        }
        
        scanner.close();
    }
    
    public static int mergeElements(List<Integer> list, int k) {
        int operationCount = 0;
        while (list.size() > 1) {
            int size = list.size();
            int elementsToMerge = Math.min(k, size);
            int sum = 0;
            for (int i = size - elementsToMerge; i < size; i++) {
                sum += list.get(i);
            }
            for (int i = 0; i < elementsToMerge; i++) {
                list.remove(list.size() - 1);
            }
            list.add(sum);
            operationCount++;
            if (list.size() == 1) {
                break;
            }
        }
        return operationCount;
    }
}
