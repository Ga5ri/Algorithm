package Day4;

import java.util.Scanner;

public class Quadrant
{
    // 4분면 구하기 - 진행중
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();

        if (A > 0 && B > 0)
        {
            System.out.println("1");
        }
        else if (A < 0 && B > 0)
        {
            System.out.println("2");
        }
        else if (A < 0 && B < 0)
        {
            System.out.println("3");
        }
        else if (A > 0 && B < 0)
        {
            System.out.println("4");
        }
    }
}
