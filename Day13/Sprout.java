package Day13;

import java.util.Arrays;

public class Sprout
{
    // 새싹 그리기
    public static void main(String[] args)
    {
        System.out.print("         ,r'\"7");
        System.out.println();
        System.out.print("r`-_   ,'  ,/");
        System.out.println();
        System.out.print(" \\. \". L_r'");
        System.out.println();
        System.out.print("   `~\\/");
        System.out.println();
        System.out.print("      |");
        System.out.println();
        System.out.println("      |");

        int[] num_list = {1,2,3,4,5,6,7};
        int n = 6;
        int answer = 0;
        for (int i : num_list)
        {
            if (i == n)
                answer = 1;
            else
                answer = 0;
        }
        System.out.println(answer);
    }
}
