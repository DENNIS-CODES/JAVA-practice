//Find 2 Elements in the Array such that Difference between them is Largest.
import java.util.Scanner;
public class Largest_Difference 
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int diff, greatest_diff;
        greatest_diff = 0;
        int a1 = 0, a2 = 0;
        for(i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                diff = Math.abs(a[i] - a[j]);
                if(diff > greatest_diff)
                {
                    greatest_diff = diff;
                    a1 = i;
                    a2 = j;
                }
            }
        }
        System.out.println("Greatest Difference:"+greatest_diff);
        System.out.println("Two elements with largest difference:"+a[a1]+" and "+a[a2]);
    }
}