package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1
{
    public static void main(String[] args) throws IOException
    {
        // 문자와 문자열 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine(); // 입력받을 문자열
        int i = Integer.parseInt(br.readLine()); // 입력받을 몇번째 인지 확인하는 정수

        String[] arr = S.split(""); // 배열에 조각내서 담기
        System.out.println(arr[i - 1]); // 입력받은 값 -1 을 통해 해당 위치의 값 출력
    }
}
