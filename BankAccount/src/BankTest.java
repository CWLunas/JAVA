public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        account1.deposit(1525, "checking");
        account2.deposit(2900, "savings");
        account3.deposit(500, "checking");

        // Withdrawal Test
        account1.withdraw(200, "checking");
        account2.withdraw(500, "savings");
        account3.withdraw(1000, "savings");

        // Static Test
        System.out.println("Number of bank accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Total money in all accounts: $" + BankAccount.getTotalMoney());
    }
}