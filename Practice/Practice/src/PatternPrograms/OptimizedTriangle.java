package PatternPrograms;
import java.util.*;
public class OptimizedTriangle 
{
	public static void main(String[] args)
	{
		int n,x=1,j,k,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			if(i<=n/2)
			{
				j=i+1;
				k=n/2-i;
			}
			else
			{
				j=i-x;
				x+=2;
				k=i-n/2;
			}
			for(;j<=n/2;j++)
			{
				System.out.print(" ");
			}
			for(;k<=n/2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
