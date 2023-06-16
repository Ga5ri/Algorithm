package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average
{
    public static void main(String[] args) throws IOException
    {
        // 세준이의 기말고사 점수 조작..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N은 과목 수, sum은 점수의 합, max는 최댓값
        // scores 배열은 점수들을 저장할 배열
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        int sum = 0;
        int max = 0;

        // 점수 배열에 입력받은 점수들을 저장해주고,
        // 그 점수들을 다 더해준다.
        // 만약 max 변수가 scores[i] 보다 작으면 max에 scores[i]를 저장해준다
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            scores[i] = Integer.parseInt(st.nextToken());
            sum += scores[i];
            if(max < scores[i])
                max = scores[i];
        }
        System.out.println((double)sum*100/max/N);
    }
}
