package hillel.lesson8.homework8;

public class BankNew {


    class InnerAccount {
        int accountNumber;
        double balance;

        public InnerAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }
    }

    class InnerTransactions {

    }

    public static void main(String[] args) {
        BankNew bankNew = new BankNew();

    }

}
