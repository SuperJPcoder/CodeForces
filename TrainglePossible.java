import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair> arr = new ArrayList<>();

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            arr.add(new Pair(value, i));
        }

        Collections.sort(arr, Comparator.comparingInt(p -> p.value));

        while (q-- > 0) 
        {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            ArrayList<Integer> sublist = getSublist(arr, l, r);

            if (canFormTwoTriangles(sublist)) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    public static ArrayList<Integer> getSublist(List<Pair> sortedArr, int l, int r) 
    {
        ArrayList<Integer> sublist = new ArrayList<>();

        for (Pair pair : sortedArr) 
        {
            if (pair.index >= l - 1 && pair.index <= r - 1) 
            {
                sublist.add(pair.value);
            }
        }
        return sublist;
    }

    public static boolean canFormTwoTriangles(ArrayList<Integer> arr) 
    {
        if (arr.size() < 6) 
        {
            return false;
        }

        for (int i = 0; i <= arr.size() - 3; i++) 
        {
            if (isTriangle(arr.get(i), arr.get(i + 1), arr.get(i + 2))) 
            {
                ArrayList<Integer> copyList = new ArrayList<>(arr);
                copyList.remove(i + 2);
                copyList.remove(i + 1);
                copyList.remove(i);

                for (int j = copyList.size() - 1; j >= 2; j--) 
                {
                    if (isTriangle(copyList.get(j - 2), copyList.get(j - 1), copyList.get(j))) 
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isTriangle(int a, int b, int c) 
    {
        return a + b > c;
    }
}
