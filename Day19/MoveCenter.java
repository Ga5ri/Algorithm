package Day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveCenter
{
    // 센터 이동 알고리즘 2903번
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2, n) + 1, 2));
    }
}
