package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchPeople
{
    public static void main(String[] args) throws IOException
    {
        // 과제 미제출자 색출하기
        // 정수 A+B4 랑 비슷하게 이해가 잘 안감...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[31];

        for (int i = 1; i < 29; i++)
        {
            int N = Integer.parseInt(br.readLine());
            arr[N] = true;
        }
        for (int i = 1; i < arr.length; i++)
        {
            if (!arr[i])
                System.out.println(i);
        }
        br.close();
    }
}
