package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class programerss
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        List<Integer> result = new ArrayList<>();

        for (int i : arr)
            result.add(i);

        for(int i = 0; i <= query.length; i++)
        {
            if(i % 2 == 0)
            {
                for (int j = query[i]+1; j < result.size(); j++)
                {
                    result.remove(result.get(j));
                }
            }
            else
            {
                for (int k = query[i]-1; k >= 0; k--)
                    result.remove(result.get(k));
            }
        }
        System.out.println(result);
    }
}
