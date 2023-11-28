package hillel.lesson8.homework8;

public class Bank {
    private static final int MAX_ACCOUNTS = 3;
    private Account[] accounts;
    private Transactions[] transactionHistory;

    public Bank() {
        this.accounts = new Account[MAX_ACCOUNTS];
        this.transactionHistory = new Transactions[MAX_ACCOUNTS];
    }

    public Account createAccount(int accountNumber, double initialBalance) {
        for (int i = 0; i < MAX_ACCOUNTS; i++) {
            if (accounts[i] == null) {
                Account newAccount = new Account(accountNumber, initialBalance);
                accounts[i] = newAccount;
                transactionHistory[i] = new Transactions();
                return newAccount;
            }
        }
        System.out.println("Cannot create a new account. Maximum number of accounts reached.");
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            transactionHistory[accountNumber - 1].recordTransaction("Deposit", amount);
        } else {
            System.out.println("Invalid account number. Deposit failed.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.withdraw(amount);
                transactionHistory[accountNumber - 1].recordTransaction("Withdrawal", amount);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid account number. Withdrawal failed.");
        }
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account != null && account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void displayAccountInfo(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Information:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Invalid account number. Cannot display account information.");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = bank.createAccount(1, 1000);
        Account account2 = bank.createAccount(2, 500);
        Account account3 = bank.createAccount(3, 200);

        bank.deposit(1, 200);
        bank.withdraw(2, 100);
        bank.deposit(3, 50);

        bank.displayAccountInfo(1);
        bank.displayAccountInfo(2);
        bank.displayAccountInfo(3);

        // Attempt to create a new account beyond the maximum limit
        Account account4 = bank.createAccount(4, 300);
    }
}

class Transactions {
    private static final int MAX_TRANSACTIONS = 10;
    private String[] transactionHistory;
    private int transactionCount;

    public Transactions() {
        this.transactionHistory = new String[MAX_TRANSACTIONS];
        this.transactionCount = 0;
    }

    public void recordTransaction(String operation, double amount) {
        if (transactionCount < MAX_TRANSACTIONS) {
            String transactionInfo = operation + ": $" + amount;
            transactionHistory[transactionCount++] = transactionInfo;
            System.out.println(transactionInfo);
        } else {
            System.out.println("Transaction history is full. Cannot record new transaction.");
        }
    }
}

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}