import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int count=0;
	        int a=1;
	        int b=1;
	        int c=1;
	        while(true)
	        {
	            
	            while(true)
	            {
	                
	                while(true)
	                {
	                    
	                    if(a*b+b*c+a*c>x||a+b+c>y)
	                    {
	                        
	                        break;
	                    }
	                    count++;
	                    c++;
	                }
	                b++;
	                c=1;
	                if(a*b+b*c+a*c>x||a+b+c>y)
	                    {
	                        
	                        break;
	                    }
	            }
	            a++;
	            b=1;
	            if(a*b+b*c+a*c>x||a+b+c>y)
	                    {
	                        
	                        break;
	                    }
	        }
	     System.out.println(count);   
	    }
	}
}