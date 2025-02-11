import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        int l=s.length();
	        s=s+'x';
	        char prev=s.charAt(0);
	        if(l==1)
	        {
	            if(prev=='a')
	            {
	                System.out.println("ba");
	            }
	            else
	            {
	                System.out.println("a"+prev);
	            }
	            continue;
	        }
	        int ctr=1;
	        for(int i=1;i<l;i++)
	        {
	            if(s.charAt(i)==prev)
	            {
	                if(prev=='a')
	                System.out.println(s.substring(0,i)+'b'+s.substring(i,l));
	                else
	                System.out.println(s.substring(0,i)+'a'+s.substring(i,l));
	                break;
	            }
	            prev=s.charAt(i);
	            ctr++;
	        }
	        if(ctr==l)
	        {
	            if(prev=='a')
	            {
	                System.out.println(s.substring(0,l)+"b");
	            }
	            else
	            {
	                System.out.println(s.substring(0,l)+"a");
	            }
	        }
	    }
	}
}