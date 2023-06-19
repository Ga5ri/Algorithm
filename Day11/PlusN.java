package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusN
{
    // N개의 숫자를 입력받아 모두 더하라
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");

        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
