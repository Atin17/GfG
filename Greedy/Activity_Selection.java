import java.util.*;
class GFG {
	public static void main (String[] args)  {
	Scanner S = new Scanner(System.in);
	int t = S.nextInt();
	while(t>0)
	{
	    int n = S.nextInt();
	    int s[] = new int[n];
	    int f[] = new int[n];
	    for(int i=0; i<n ; i++)
	    s[i] = S.nextInt();
	    for(int i=0; i<n ; i++)
	    f[i] = S.nextInt();
	    
	    System.out.println(as(n, s, f));
	    t--;
	}
	}
	static int as(int n, int s[], int f[])
	{
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<n ; i++)
	    {
	        try
	        {
	            if(map.get(f[i]) > s[i])
	            continue;
	        }
	        catch(Exception e){}
	    map.put(f[i], s[i]);
	    
	    }
	    Arrays.sort(f);
	    int count = 1;
	    int p=f[0];
	    for(int i=1; i<n ; i++)
	    {
	        if(map.get(f[i])>=p)
	        {
	        count++;
	        p = f[i];
	        }
	    }
	    return count;
	}
}
	
