package Day5;

import java.util.Scanner;

public class PlusN
{
    public static void main(String[] args)
    {
        // 1부터 n 더하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i ++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
