package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2
{
    // 문자열 입력받아 첫글자 마지막글자 출력하기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++)
        {
            String[] s = br.readLine().split("");
            System.out.println(s[0]+s[s.length - 1]);
        }
    }
}
