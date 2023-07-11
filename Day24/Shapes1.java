package Day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shapes1
{
    // 직사각형 넓이 구하기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(A*B);
    }
}
