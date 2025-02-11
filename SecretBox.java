import java.util.*;
public class SecretBox
{    
    public int findFactor(int num)
    {
        return 10;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x,y,z;
            int ans=0;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            int vol=x*y*z;
            int k=sc.nextInt();
            if(vol<=k)
            {
                ans=0;
            }
            else
            {
                //check for 1
                if(k==1)
                {
                    ans=1;
                }
                else
                {
                    //check for prime number
                    int sr=(int)Math.sqrt(k);
                    int ctr=0;
                    for(int j=2;j<=sr+1;j++)
                    {
                        if(k%j==0)
                        {
                            ctr++;break;
                        }
                    }
                    if(ctr==0)
                    {
                        //k,1,1

                        if(k>Math.max(x,Math.max(y,z)))
                        {
                            ans=0;
                        }
                        else
                        {
                            ans=Math.max(x*y*(z-k+1),Math.max(x*(y-k+1)*z,(x-k+1)*y*z));
                        }
                    }

                    else
                    {
                        //check for cuberoot
                        int cr=(int)Math.cbrt(k);
                        if(Math.pow(cr,3)==k)
                        {
                            //k,k,k
                            if(cr<=Math.min(x,Math.min(y,z)))
                            {
                                //first check if mod==0..place this before eveery ans calculation..actually no need
                                
                                ans=(x-cr+1)*(y-cr+1)*(z-cr+1);
                            }
                            else
                            {
                                findFactor(k);
                            }
                        }

                        //cuberoot and round off and multiply.
                        else
                        {
                            findFactor(k);
                        }
                    }
                }
            }
            System.out.print(ans+" ");
        }
        sc.close();
    }
}
