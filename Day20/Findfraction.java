package Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Findfraction
{
    // 분수 찾기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int cnt = 1;
        int cnt_sum = 0;

        while (true)
        {
            // 직전 대각선 누적합 + 해당 대각선 개수 이요한 범위 판별
            if (X <= cnt_sum + cnt)
            {
                if(cnt % 2 == 1)
                {
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 내의 블럭 개수 - (X번째 - 직전 대각선까지의 블럭 개수 -1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    System.out.println((cnt - (X - cnt_sum - 1)) + "/" + (X - cnt_sum));
                }
                else
                {
                    // 대각성상의 블럭의 개수가 짝수라면
                    // 홀수 일때의 출력을 반대로
                    System.out.println((X - cnt_sum) + "/" + (cnt - (X - cnt_sum - 1)));
                }
                break;
            }
            else
            {
                cnt_sum += cnt;
                cnt++;
            }
        }
    }
}
