package Day8;

import java.io.*;
import java.util.StringTokenizer;

public class ArrayCount
{
    // 배열 개수새기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for (int i : arr)
        {
            if (b == i)
            {
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }
}
