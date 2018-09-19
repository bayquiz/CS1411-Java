import java.util.Scanner;
public class a3 {
    public static void main(String [] args) {
        // getting user input for a, b, and c

        double a;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a double value for a: ");
        a = keyboard.nextDouble();
       // System.out.println(a); //keeping this as a check

        double b;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter a double value for b: ");
        b = keyboard.nextDouble();
        //System.out.println(b); // keeping this as a check

        double c;
        Scanner keyboard3 = new Scanner(System.in);
        System.out.print("Enter a double value for c: ");
        c = keyboard.nextDouble();
       // System.out.println(c); //keeping this as a check

        double x1;
        double x2;
        double x3;
        double complexX1;
        double complexX2;
        //creating for possible answers

        double answer;
        double discriminant;
        if (a == 0) //there is only one solution
        {
            answer = -1 * (b / c);
            System.out.println("Your answer is: " + answer);
        }
        else {
            discriminant = (Math.pow(b,2) - 4*(a*c));
            System.out.println("the discriminant is " + discriminant);

            if ( discriminant > 0) {
                x1 = ((-1 * b) + Math.sqrt((Math.pow(b,2)) - (4*a*c))) / (2*a);
                System.out.println("Your x1 = " + x1);

                x2 = ((-1 * b) - Math.sqrt((Math.pow(b,2)) - (4*a*c))) / (2*a);
                System.out.println("Your x2 = " + x2);
            }
            else if (discriminant == 0) {
                x3 = ((-1 * b)/ (2*a));
                System.out.println("Your answer is : " + x3);
            }
            //handling when discriminant < 0
            else {
                System.out.println("Because the discriminant is negative, there is technically" +
                " no real solution.");
                System.out.println("I tried my best to work around the complext numbers and provide something.");

                complexX1 = (((-1 * b) + (Math.sqrt(-1 * discriminant))) / (2*a));
                //have to print it correctly as a work around for complex numbers
                System.out.println("Your complex answer #1 is : " + complexX1 + "i");

                complexX2 = (((-1 * b) - (Math.sqrt(-1 * discriminant))) / (2*a));
                System.out.println("Your complex answer #2 is : " + complexX2 + "i");


            }
        }

    }
}
