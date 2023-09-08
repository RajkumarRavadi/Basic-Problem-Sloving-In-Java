import java.util.*;
public class Pattern3 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();

        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n+1-row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
