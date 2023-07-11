import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private final String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;

    // CONSTRUCTOR
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        accounts++;
    }

    // GETTERS
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getNumOfAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
        System.out.println("Successfully deposited $" + amount + " into " + accountType + " account.");
        System.out.println("Account Number: " + accountNumber);

        // Display remaining balance
        System.out.println("Remaining " + accountType + " balance: $" + getBalance(accountType));
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
                System.out.println("Successfully withdrew $" + amount + " from checking account.");
            } else {
                System.out.println("Insufficient funds in checking account.");
                return;
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
                System.out.println("Successfully withdrew $" + amount + " from savings account.");
            } else {
                System.out.println("Insufficient funds in savings account.");
                return;
            }
        }
        System.out.println("Account Number: " + accountNumber);

        // Display remaining balance
        System.out.println("Remaining " + accountType + " balance: $" + getBalance(accountType));
    }

    public void getBalance() {
        System.out.println("Checking balance: $" + checkingBalance);
        System.out.println("Savings balance: $" + savingsBalance);
    }

    private double getBalance(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            return checkingBalance;
        } else if (accountType.equalsIgnoreCase("savings")) {
            return savingsBalance;
        }
        return 0.0;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}