package PatternPrograms;
import java.util.*;


public class HalfTriangle 
{
	public static void main(String[] args)
	{
		int n,k,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			if(i<=n/2)
			{
				k=n/2-i;
			}
			else
			{
				k=i-n/2;
			}
			for(;k<=n/2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
