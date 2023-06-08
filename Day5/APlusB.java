package Day5;

import java.util.Scanner;

public class APlusB
{
    public static void main(String[] args)
    {
        // A, B 입력받아 더하기
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] = new int[A];

        for (int i = 0; i < A; i++)
        {
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = b + c;
        }
        sc.close();

        for (int k : arr)
        {
            System.out.println(k);
        }
    }
}
