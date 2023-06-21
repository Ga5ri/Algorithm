package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintOriginal
{
    // 입력받은 그대로 출력하기
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // IntelliJ 경우 엔터도 값으로 인식하기 때문에 별도 처리 필요!
        StringBuilder builder = new StringBuilder();
        while (true)
        {
            String str = br.readLine();
            if (str == null || str.isEmpty())
            {
                break;
            }
            builder.append(str).append("\n");
        }
        br.close();
        System.out.println(builder);
    }
}
