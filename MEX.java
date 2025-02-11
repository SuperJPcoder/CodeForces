import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    System.out.println(Math.max(r,c)+1);
		}
	}
}