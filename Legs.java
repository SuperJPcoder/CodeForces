import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int x=sc.nextInt();
	        int y=x%4;
	        int z=(int)x/4;
	        System.out.println(z+y/2);
	    }
		
	}
}