package Day6;

import java.util.Scanner;

public class intLong
{
    // 코딩은 체육과목 입니다 ㅋㅋ
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n / 4;

        for (int i = 0; i < div; i++)
        {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
