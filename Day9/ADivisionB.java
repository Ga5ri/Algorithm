package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ADivisionB
{
    public static void main(String[] args) throws IOException
    {
        // A나누기 B 의 나머지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<>();


        for (int i = 0; i < 10; i++)
        {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(h.size());
    }
}
