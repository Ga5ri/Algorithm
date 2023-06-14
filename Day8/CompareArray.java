package Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareArray
{
    public static void main(String[] args) throws IOException
    {
        // 입력받은 X 보다 작은 수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++)
        {
            int value = Integer.parseInt(st.nextToken());

            if (value < X)
                sb.append(value).append(' ');
        }
        System.out.println(sb);

        br.close();
    }
}
