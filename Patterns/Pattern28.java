import java.util.*;
public class Pattern28
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1; row<2*n; row++)
		{
		    int colINEachRow = row>n ? 2*n-row : row;
		    int noOfSpace = n-colINEachRow;
		    
		    //Printing spaces
		    for(int s=1; s<=noOfSpace; s++)
		    {
		        System.out.print(" ");
		    }
		    
		    //Printing *'s
		   for(int col=1; col<=colINEachRow; col++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
