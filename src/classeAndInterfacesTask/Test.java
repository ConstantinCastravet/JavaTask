package classeAndInterfacesTask;

public class Test {
    public static void main(String[] args) throws Exception {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        System.out.println("Interest rate:4%");
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest() + "\n");
        System.out.println("Interest rate:5%");
        SavingsAccount.modifyInterestRate(-0.05);
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());
    }
}
