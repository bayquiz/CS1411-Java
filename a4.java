import java.util.Scanner;
public class a4 {
    public static void main(String [] args) {

        int totalYears;
        double total = 0;
        double average;
        double rainfall = 0;
        //double totalRainfall = 0;
        int totalMonths = 0;


        // first loop for years
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many years : ");
        totalYears = keyboard.nextInt();
        System.out.println(totalYears);


        //catching bad values for years
        if (totalYears < 1)
            System.out.println("You must enter a number larger than 0.");

        //starting year loop
        for (int years = 1; years <= totalYears; years++) {
            //total = 0;

            // now doing months loop
            for (int months = 1; months <= 12; months++) {
                Scanner keyboard1 = new Scanner(System.in);
                System.out.println("Enter rainfall for the month: ");
                rainfall = keyboard.nextDouble();
                //catching bad value for rainfall
                while (rainfall < 0) {
                    System.out.println("You cannot enter a negative number.");
                    rainfall = keyboard.nextDouble();
                }
                    // adding to the total

                total = total + rainfall;
                totalMonths = totalYears * months;
            }

        }

            //printing everything
            //totalMonths = totalYears * months
            average = total / totalMonths;
            System.out.println("The total numbers of months is: " + totalMonths);
            System.out.println("The total amount of rainfall is: " + total + " inches.");
            System.out.println("The average rainfall per month: " + average);


    }
}
