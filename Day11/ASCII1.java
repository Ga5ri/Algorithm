package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII1
{
    // 입력받은 값의 아스키 코드값을 출력
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ch = br.readLine().charAt(0);

        System.out.println(ch);
    }
}
