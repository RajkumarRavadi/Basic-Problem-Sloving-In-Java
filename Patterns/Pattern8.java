import java.util.*;
public class Pattern8
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		
		for(int row=1; row<=n; row++)
		{
		    
		    int colINEachRow=2*row-1;
		    int noOfSpace = 2*n-colINEachRow;
		    
		    //Printing spaces
		    for(int s=1; s<=noOfSpace; s++)
		    {
		        System.out.print(" ");
		    }
		    
		    
		    //Printing *'s
		   for(int col=1; col<=colINEachRow; col=col+1)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
