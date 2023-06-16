package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength
{
    // 문자열 입력받고 길이 구하기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(s.length());
    }
}
