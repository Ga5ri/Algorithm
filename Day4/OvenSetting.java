package Day4;

import java.util.Scanner;

public class OvenSetting
{
    // 오븐 시간 구하기
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();

        int min = 60 * A + B; // 시간을 분으로
        min = min + C; // 남는 분 더해주기

        int h = (min / 60) % 24;
        int m = min % 60;

        System.out.println(h + " " + m);
    }
}
