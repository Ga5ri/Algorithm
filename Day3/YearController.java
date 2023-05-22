package Day3;

import java.util.Scanner;

public class YearController
{
    public static void main(String[] args)
    {
        // 윤년 확인
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if((A%4 == 0 && A%100 != 0) || A%400 == 0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
