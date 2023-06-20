package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant
{
    // 수학을 못하는 상수
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

       /* String s1 = st.nextToken();
        String s2 = st.nextToken();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int reverse1 = Integer.parseInt(sb1.reverse().toString());
        int reverse2 = Integer.parseInt(sb2.reverse().toString());*/

        int s1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int s2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(Math.max(s1, s2)); // s1 > s2 ? s1:s2
    }
}
