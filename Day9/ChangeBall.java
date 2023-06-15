package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeBall
{
    public static void main(String[] args) throws IOException
    {
        // 바구니에 공 바꾸기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++)
            arr[i] = i + 1;
        for (int i = 0; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int temp = arr[A - 1];
            arr[A - 1] = arr[B - 1];
            arr[B - 1] = temp;
        }

        br.close();

        for (int b : arr)
        {
            System.out.print(b + " ");
        }
    }
}
