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
	        int[] a=new int[n];
	        int lar=0;
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	            if(i%2==0)
	            {
	                if(a[i]>lar)
	                {
	                    lar=a[i];
	                }
	            }
	        }
	        System.out.println(lar);
	    }
	}
}