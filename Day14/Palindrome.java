package Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{
    // 펠린드롬 앞뒤가 같은 단어
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        boolean checked = true;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1)))
            {
                checked = false;
                break;
            }
        }
        if (checked == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
