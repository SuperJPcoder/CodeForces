import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int peri=0;
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            if(i==0)
	            {
	                peri=4*m;
	                continue;
	            }
	            peri=peri+(4*m - 2*(2*m-x-y));
	        }
	        System.out.println(peri);
	    }
	}
}