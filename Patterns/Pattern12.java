import java.util.*;
public class Pattern12
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		
		for(int row=1; row<=2*n; row++)
		{
		    
		    int colINEachRow = row>n ? row-n : n-row+1;
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
