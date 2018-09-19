

public class SavingsAccount {
    double annualInterest;
    double balance;
    // created fields
    double totalWithdraw;
    double totalDeposit;
    double newBalance;

    //now creating constructors for starting balance.
    public SavingsAccount(double startBalance) {
        balance = startBalance;
       // Interest = annualInterest;
    }

    //now creating method for withdrawal
    public void withdrawal(double amount) {
        balance = balance - amount;
        totalWithdraw = totalWithdraw + amount;
    }

    //HAVE TO FIGURE OUT HOW TO KEEP BALANCE VARIABLE UPDATED FOR EACH MEHTOD!!!!!

    //creating method for a deposit
    public void deposit(double amount) {
        balance = balance + amount;
        totalDeposit = totalDeposit + amount;
    }

    //method for annual interest

    //method for monthly interest
    public void monthlyInterest(double interest) {
        double monthInterest = interest / 12;
        newBalance =  (monthInterest * balance);
        balance = balance + newBalance;
       // return monthInterest;
    }
    //return balance
    public double getBalance() {
        return balance;
    }

    //return interest
    public double getInterest(){
        return newBalance;
    }

    //return deposit
    public double getDeposit(){
        return totalDeposit;
    }

    //return withdraw
    public double getWithdraw(){
        return totalWithdraw;
    }

    public void display(){
        balance = Math.round(balance * 100.0) / 100.0;
        newBalance = Math.round(newBalance * 100.0) / 100.0;
        System.out.println();
        System.out.println("The ending balance is: $" + balance);
        System.out.println("The total amount of deposits is: $" + totalDeposit);
        System.out.println("The total amount of withdraws is: $" + totalWithdraw);
        System.out.println("The total interest earned is: $" + newBalance);
    }

}
