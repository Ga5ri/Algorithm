package Day1;

import java.util.Scanner;

public class CompareNumber
{
    public static void main(String[] args)
    {
        // 두 수를 비교하여 부등호 출력하기
        // Scanner 사용
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B)
        {
            System.out.println(">");
        }
        else if (A < B)
        {
            System.out.println("<");
        }
        else
        {
            System.out.println("==");
        }
    }
}
