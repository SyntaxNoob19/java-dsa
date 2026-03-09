// Write a Program that takes N elements (max. value of N is 100 and N is the float number specified by user) from user, stores data in an array and Calculates the average of those numbers.
import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n[] = new float[100];

        int N;
        float sum = 0, avg;

        System.out.println("Enter number of elements:");
        N = sc.nextInt();

        if(N > 100)
        {
            System.out.println("Maximum allowed elements is 100");
            return;
        }

        System.out.println("Enter " + N + " numbers:");
        
        for(int i = 0; i < N; i++)
        {
            n[i] = sc.nextFloat();
            sum += n[i];
        }

        avg = sum / N;

        System.out.println("Average of those numbers: " + avg);
    }
}

