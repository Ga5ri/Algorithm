package Day6;

import java.util.Scanner;

public class APlusB2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for (int i = 1; i <= A; i++)
        {
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("CASE #" + i + ": " + (b + c));
        }

        sc.close();
    }
}
