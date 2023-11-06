import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        int [] dataPoints = new int [ARRAY_SIZE];

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        System.out.println("Data Points: ");
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.print(dataPoints[e]);
            if (e < dataPoints.length - 1 )
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
        }
        int ave = sum / dataPoints.length;

        System.out.println("The sum of the data array is: " + sum);
        System.out.println("The average of the data array is: " + ave);


        int searchTarget = SafeInput.getRangedInt(in, "Enter a value between: ", 1, 100);
        int count = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {

            if (dataPoints[e] == searchTarget) {
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("The value you entered (" + searchTarget + ") was found " + count + " times!");
        }
        else
        {
            System.out.println("The value you entered was not found!");
        }

        int searchValue = SafeInput.getRangedInt(in, "Enter a value between: ", 1, 100);
        boolean valueFound = false;
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == searchTarget);
            {
                System.out.println("The value " + searchValue + " was found at array index " + e);
                valueFound = true;
                break;
            }
        }
        if(!valueFound)
        {
            System.out.println("The value " + searchValue + " was not found");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max < dataPoints[e])
            {
                min = dataPoints[e];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints)) ;
    }
    public static double getAverage(int[] values)
    {
        int sum = 0;
        for(int value : values)
        {
            sum += value;
        }
        return sum / (double) values.length;
    }
}