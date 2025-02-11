import java.util.*;
public class Main
{
    public static void cost(String str) {
        Stack<Integer> stack = new Stack<>();
        int totalCost = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')' && !stack.isEmpty()) {
                int openIndex = stack.pop();
                totalCost += (i - openIndex);
            }
        }
        
        System.out.println(totalCost);
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int l=sc.nextInt();
	        String s=sc.next();
	        for(int i=l-1;i>=2;i-=2)
	        {
	            if(s.charAt(i)==')')
	            {
	                if(s.charAt(i-2)==')')
	                {
	                    s=s.substring(0,i-1)+'('+s.substring(i,l);
	                }
	                else
	                {
	                    s=s.substring(0,i-1)+')'+s.substring(i,l);
	                    s=s.substring(0,i-3)+'('+s.substring(i-2,l);
	                }
	            }
	        }
	        s='('+s.substring(1,l);
	        cost(s);
	    }
	}
}