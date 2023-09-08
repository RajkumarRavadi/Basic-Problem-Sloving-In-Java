import java.util.*;
public class Pattern5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		
		for(int row=1; row<2*n; row++)
		{
		    int colInEachRow = row>n ? 2*n-row : row ; 
		    for(int col=1; col<=colInEachRow; col++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
