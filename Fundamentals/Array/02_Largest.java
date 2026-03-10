//Write a Program that takes n element from user and displays the largest element of an array
import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        int N = sc.nextInt();
        
        int[] n = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for(int i = 0; i < N; i++)
        {
             n[i] = sc.nextInt();
        }
        
        int max = 0;
        for(int i = 0; i < N; i++)
        {
            if( n[i] >= max)
            {
                max = n[i];
            }
        }
        
        System.out.println("The largest value is "+ max);
        
    }
}
        
