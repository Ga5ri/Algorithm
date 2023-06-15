package Day9;

import java.io.*;
import java.util.StringTokenizer;

public class InsertBall
{
    public static void main(String[] args) throws IOException
    {
        // 바구니에 공 넣기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++)
            {
                arr[j] = K;
            }
        }
        for (int k : arr)
        {
            System.out.print(k + " ");
        }

        br.close();
    }
}
