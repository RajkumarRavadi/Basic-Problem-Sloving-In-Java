import java.util.*;
public class Pattern2 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();

        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
