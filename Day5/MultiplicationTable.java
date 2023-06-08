package Day5;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // 구구단 출력
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        sc.close();

        for (int i = 1; i < 10; i ++)
        {
            System.out.println(A + " * " +  i + " = "  + A * i);
        }
    }
}
