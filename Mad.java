import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Read the number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Read the size of the array for each test case
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());  // Read the elements of the array
            }
            
            int result = calculateSum(list);
            System.out.println(result);  // Output the result for the current test case
        }
        
        sc.close();
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;

        while (!list.isEmpty()) {
            int currentSum = 0;
            for (int num : list) {
                currentSum += num;
            }
            sum += currentSum;

            ArrayList<Integer> newList = new ArrayList<>();
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            int currentMAD = 0;
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                if (frequencyMap.get(num) >= 2) {
                    currentMAD = Math.max(currentMAD, num);
                }
                newList.add(currentMAD);
            }

            if (newList.isEmpty() || newList.get(newList.size() - 1) == 0) {
                break;  // If the new list is empty or the last value is 0, stop the process
            }
            list = newList;
        }

        return sum;
    }
}
