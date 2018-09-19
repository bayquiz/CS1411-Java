import java.util.Scanner;
public class assignment6 {
    //START METHOD main
    public static void main(String [] args){
        //Initialize variables
        double meter;

        //GET distance in meters
        //Scanner keyboard = new Scanner(System.in);
        //System.out.print("Enter a distance in meters: ");
        //meter = keyboard.nextDouble();

        // taking care of bad input
      //  while (meter <= 0){
        //    System.out.println("Distance cannot be negative.");
          //  System.out.print("Enter a distance in meters: ");
            //meter = keyboard.nextDouble();
           // }
            //RUN menu
        menu();
        }//end main

        //START  menu
        public static void menu(){
            //initialize variables and constants
            double meter ;
            int flag = 0;
            int menuPick;

            //GET distance in meters
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a distance in meters: ");
            meter = keyboard.nextDouble();
            //menu loop

            do {
                //DISPLAY options
                System.out.println("1.Convert to kilometer ");
                System.out.println("2.Convert to inches ");
                System.out.println("3.Convert to feet ");
                System.out.println("4.Quit the program");

                //GET user menu choice
                Scanner keyboard2 = new Scanner(System.in);
                System.out.println("\nEnter your choice: ");
                menuPick = keyboard2.nextInt();

                switch (menuPick) {
                    case 1:
                        showKilometers(meter);
                        break;
                    case 2:
                        showInches(meter);
                        break;
                    case 3:
                        showFeet(meter);
                        break;
                    case 4:
                        System.out.println("exiting the program!");
                        flag = -99;
                        break;
                }
            }

            while (flag != -99);
        }
        //END METHOD menu

        //START METHOD showKilometers
        public static void showKilometers(double meter){
            double kilometers;
            kilometers = meter * .001;
            //display result
            System.out.printf("%,.2f meters is %,.2f kilometers%n%n" , meter, kilometers);
        }
        //END showKilometers

        //START METHOD showInches
        public static void showInches(double meter){
            double inches;
            inches = meter * 39.37 ;
            //display result
            System.out.printf("%,.2f meters is %,.2f inches%n%n" , meter, inches);
        }
        //END METHOD showInches

        //START METHOD showFeet
        public static void showFeet(double meter){
            double feet;
            feet = meter * 3.281;
            //display result
            System.out.printf("%,.2f meters is %,.2f feet%n%n" , meter, feet);
        }
        //END METHOD showFeet
}
