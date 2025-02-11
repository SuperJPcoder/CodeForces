import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Collect frequencies and sort them
            List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
            Collections.sort(frequencies);

            // Minimize distinct groups
            int distinctGroups = frequencies.size();
            for (int freq : frequencies) {
                if (k >= freq) {
                    k -= freq;
                    distinctGroups--;
                } else {
                    break;
                }
            }
            if(distinctGroups==0)distinctGroups=1;
            System.out.println(distinctGroups);
        }
        sc.close();
    }
}
