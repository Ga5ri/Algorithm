package Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyWord
{
    // 단어 공부 1157번
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳 개수 26개인 배열 선언
        String s = br.readLine();


        for (int i = 0; i < s.length(); i++)
        {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') // 대문자 범위
            {
                arr[s.charAt(i) - 97]++; // 해당 인덱스의 값 1 증가
            }
            else
            {
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++)
        {

            if (arr[i] > max)
            {
                max = arr[i];
                ch = (char) (i + 65); // 대문자 출력이므로 65 더해준다
            }
            else if (arr[i] == max)
            {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
