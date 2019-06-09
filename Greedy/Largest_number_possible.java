import java.util.Scanner;
class GFG {
	public static void main (String[] args)  {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	while(t>0)
	{
	    int n = s.nextInt();
	    int sum = s.nextInt();
	    if(9*n<sum || n>1 && sum==0)
            System.out.print(-1);
        else
	        lnp(n, sum);
	    System.out.println();
	    t--;
	}
	}
	static void lnp(int i, int sum)
	{
	    if(i==1)
	    {
	        System.out.print(sum);
	        return;
	    }
	    int m = Math.min(sum,9);
	    sum -= m;
	    System.out.print(m);
	    lnp(i-1, sum);
	}	
}
