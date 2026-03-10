// Write a Program that calculates the standard deviation of 10 data using arrays

// Standard Deviation measures how much the values in a dataset
// deviate (spread out) from the mean (average).
// Steps:
// 1. Calculate the mean of all numbers.
// 2. Find the difference between each number and the mean.
// 3. Square each difference.
// 4. Find the average of these squared differences (variance).
// 5. Take the square root of the variance to get the standard deviation.


import java.util.Scanner;

class  StandardDeviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];

        System.out.println("Enter " + n.length + " numbers:");

        for(int i = 0; i < n.length; i++)
        {
            n[i] = sc.nextInt();
        }

        double sum = 0;

        for(int i = 0; i < n.length; i++)
        {
            sum += n[i];
        }

        double mean = sum / n.length;

        double sumsquare = 0;

        for(int i = 0; i < n.length; i++)
        {  
            double difference = n[i] - mean;
            sumsquare += difference * difference;
        }

        double variance = sumsquare / n.length;
        double result = Math.sqrt(variance);

        System.out.println("Standard deviation is " + result);
        
    }
}
        
