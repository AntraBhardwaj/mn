package number;
import java.util.*;
public class Reversenum
{
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
       int i,n,fact=1;
       Scanner s = new Scanner(System.in);
       n =s.nextInt();
       s.close();
       for(i=1;i<=n;i++)
    	   fact=fact*i;
       System.out.println(fact);
     }
}

