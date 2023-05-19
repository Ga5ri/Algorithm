package Day1;

import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        // 3자리수 곱하기 과정 출력 - 2588번
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        sc.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));
    }
}
