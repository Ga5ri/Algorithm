package Day3;

import java.util.Scanner;

public class AddNumber
{
    public static void main(String[] args)
    {
        // 세자리 수 더하기
        Scanner sc= new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);
    }
}
