package classeAndInterfacesTask;

public class SavingsAccount {

    private double savingsBalance;
    private static double annualInterestRate;


    public SavingsAccount(double savingsBalance) throws Exception {
        setSavingsBalance(savingsBalance);
    }


    public double calculateMonthlyInterest() {
        return savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double newAnnualInterestRate) throws Exception {
        if (newAnnualInterestRate < 0) {
            throw new IllegalAccessException("Rate couldn't be negative");
        }
        annualInterestRate = newAnnualInterestRate;
    }


    public void setSavingsBalance(double savingsBalance) throws Exception {
        if (savingsBalance < 0) {
            throw new IllegalAccessException("Balance couldn't be negative");
        }
        this.savingsBalance = savingsBalance;
    }


}
