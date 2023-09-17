package Functions;

import java.util.*;
import java.lang.Math.*;
public class maxOfThreeNumbers 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        
        int result = greatestOfThree(num1,num2,num3);
        System.out.println(result);
    }
    
    
    static int greatestOfThree(int num1,int num2,int num3)
    {
        int ans = Math.max(num1, Math.max(num2, num3));
        return ans;
    }
}
