import java.util.Scanner;

public class a7 {
   public static void main(String[] args) {
      double testBalance;
      double testInterest;
      int months;
      double withdrawAmount;
      double depositAmount;

      //getting input for balance
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter your starting balance : ");
       testBalance = keyboard.nextDouble();

       //getting input for interest
       Scanner keyboard1 = new Scanner(System.in);
       System.out.println("Please enter the annual interest rate in decimal form: ");
       testInterest = keyboard1.nextDouble();

       //getting the number of months
       Scanner keyboard2 = new Scanner(System.in);
       System.out.println("Please enter the number of months since the account was created: ");
       months = keyboard2.nextInt();

       //calling object
       SavingsAccount testAccount = new SavingsAccount(testBalance);

       // now doing a loop for the months
       for (int x=1; x <= months; x++) {
           //ask for amount deposited that month
           Scanner board = new Scanner(System.in);
           System.out.println("Please enter the amount you want to deposit this month: ");
           depositAmount = board.nextDouble();
           //now need to add this to the balance
           testAccount.deposit(depositAmount);


           // asking for withdrawal for that month
           Scanner key = new Scanner(System.in);
           System.out.println("Please enter the amount you want to withdrawal this month: ");
           withdrawAmount = key.nextDouble();
           //now need to subtract from balance
           testAccount.withdrawal(withdrawAmount);

           //doing the interest
           testAccount.monthlyInterest(testInterest);


           //calculating the monthly interest rate


       }
       //end of the for loop
       //HAVE TO PRINT EVERYTHING NICELY FORMATTED W $ SIGNS!!!!
        testAccount.display();
      //  System.out.println("THE BALANCE IS: " + testAccount.getBalance());
      // System.out.print("THE STARTING BALANCE IS: " + testBalance);
   }
}
