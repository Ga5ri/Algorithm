package Day6;

import java.util.Scanner;

public class APlusB3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));
        }
    }
}
