package Day4;

import java.util.Scanner;
public class AlarmSetting
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 시
        int M = sc.nextInt(); // 분
        sc.close();

        if(M < 45)
        {
            H = H - 1;		// 시(hour) 1 감소
            M = M + 60 - 45; 	// 분(min) 감소
            if (H < 0)
            {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else
        {
            System.out.println(H + " " + (M - 45));
        }
    }
}