package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet
{
    // 입력받은 알파벳에 대해 조건에 맞는 출력 + 아직 이해 안감...
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = -1;

        }

        String S = br.readLine();

        for (int i = 0; i < S.length(); i++)
        {
            char ch = S.charAt(i);

            if (arr[ch - 'a'] == -1)
                arr[ch - 'a'] = i;
        }

        for (int value : arr)
        {
            System.out.print(value + " ");
        }
    }
}
