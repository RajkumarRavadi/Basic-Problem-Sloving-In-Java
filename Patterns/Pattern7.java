import java.util.*;
public class Pattern7
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		
		for(int row=1; row<=n; row++)
		{
		    int colINEachRow=n-row+1;
		    int noOfSpace = n-colINEachRow;
		    
		    //Printing spaces
		    for(int s=1; s<=noOfSpace; s++)
		    {
		        System.out.print(" ");
		    }
		    
		    //Printing *'s
		   for(int col=1; col<=colINEachRow; col++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
