import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        String s=sc.next();
	        int l=4*n;
	        int arr[]=new int[5];
	        for(int i=0;i<l;i++)
	        {
	            char c=s.charAt(i);
	            if(c=='A')
	            {
	                arr[0]++;
	            }
	            else if(c=='B')
	            {
	                arr[1]++;
	            }
	            else if(c=='C')
	            {
	                arr[2]++;
	            }
	            else if(c=='D')
	            {
	                arr[3]++;
	            }
	            else
	            {
	                arr[4]++;
	            }
	        }
	        int sum=0;
	        for(int i=0;i<4;i++)
	        {
	            sum+=Math.min(n,arr[i]);
	        }
	        System.out.println(sum);
	    }
		
	}
}