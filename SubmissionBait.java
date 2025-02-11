import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) 
        {
            int n = scanner.nextInt();
            int[] array = new int[n];
            
            for (int i = 0; i < n; i++) 
            {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            boolean result = canAliceWin(array,0);
            //System.out.println(result ? "Yes" : "No");
        }
    }

    private static boolean canAliceWin(int[] array,int tem) 
    {
        int count = 0;
        if(tem==array.length)
        {
            System.out.println("No");
            return false;
        }
        int maxElement = array[array.length - 1-tem];
        
        
        for (int i=array.length-1-tem;i>=0;i--) 
        {
            if (array[i] == maxElement) 
            {
                count++;
            }
            else
            {
                break;
            }
        }
        
        if(count%2==0)
        {
            int temp=tem+count;
            canAliceWin(array,temp);
        }
        else
        {
            System.out.println("Yes");
        }
        return false;
    }
}
