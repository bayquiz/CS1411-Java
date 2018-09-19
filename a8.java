import java.util.Scanner;

public class a8 {
    public static void main(String args[]) {
        double[] year = new double[12];
        //declared array

        //now filling the values
        Scanner keyboard = new Scanner(System.in);
        for (int index = 0; index < year.length; index++) {
            System.out.print("Enter the rain for month " + (index + 1) + " : ");
            year[index] = keyboard.nextDouble();
        }
        //end of for loop
        //constructor
        Rainfall new2018 = new Rainfall(year);

        //now need to display the total amount of rain
        System.out.println("The total amount of rainfall for the year is: " +
                new2018.totalRain() + " inches.");

        //display the average amount of rain
        System.out.println("The average amount of rainfall per month is: " +
                new2018.averageRain() + " inches.");

        //display the largest month of rain
        //have to account for indexing not being the correct actual month
        int large = (int) new2018.largestMonth();
        System.out.println("The most amount of rain was: " + new2018.getRain(large) +
                " inches at month " + (large + 1));

        //display the month with the least amount of rain
        //also have to account for index being off from actual month by 1
        int small = (int) new2018.smallestMonth();
        System.out.println("The least amount of rain was: " + new2018.getRain(small) +
                " inches at month " + (small +1 ));

    }
}
