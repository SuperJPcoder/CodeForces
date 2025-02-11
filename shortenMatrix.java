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
	        int k=sc.nextInt();
	        String[] mat=new String[n];
	        for(int i=0;i<n;i++)
	        {
                mat[i]=sc.next();
	        }
	        for(int i=0;i<n;i+=k)
	        {
	            for(int j=0;j<n;j+=k)
	            {
	                System.out.print(mat[i].charAt(j));
	            }
	            System.out.println();
	        }
	    }
	}
}