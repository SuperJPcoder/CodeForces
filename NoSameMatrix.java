import java.util.*;
public class NoSameMatrix
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int k=0;k<t;k++)
	    {
    	    int n=sc.nextInt();
    	    int m=sc.nextInt();
    	    int matrix[][]=new int[n+1][m+1];
    	    for(int i=1;i<=n;i++)
    	    {
    	        for(int j=1;j<=m;j++)
    	        {
    	            matrix[i][j]=sc.nextInt();
    	        }
    	    }
    	    if(n==1&&m==1)
    	    {
    	        System.out.println("-1");
    	    }
    	    else if(m==1)
    	    {
    	        int temp=matrix[1][1];
    	        for(int i=1;i<n;i++)
    	        {
    	            System.out.println(matrix[i+1][1]);
    	        }
    	        System.out.println(temp);
    	    }
    	    else
    	    {
    	        for(int i=1;i<=n;i++)
    	        {
    	            int temp=matrix[i][1];
        	        for(int j=1;j<m;j++)
        	        {
        	            System.out.print(matrix[i][j+1]+" ");
        	        }
        	        System.out.print(temp);
        	        System.out.println();
    	        }
    	    }
	    }
	}
}