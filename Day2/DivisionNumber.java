package Day2;

import java.util.Scanner;

public class DivisionNumber
{
    public static void main(String[] args)
    {
        // 두 수 나누기 - 1008번
        // 소수점 9번째까지 표시
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A/B);
    }
}
