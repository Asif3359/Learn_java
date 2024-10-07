import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    static class Account {

        public int balance;
        public int accountNumber;

        public Account(int balance, int accountNumber) {
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void deposit(int amount) {
            this.balance += amount;
        }

        public void withdraw(int amount) {
            this.balance -= amount;
        }

        public int getBalance() {
            return this.balance;
        }
    }

    static class Customer {
        String name;
        int id;
        List<Account> accountList;

        public Customer(String name, int id) {
            this.name = name;
            this.id = id;
            this.accountList = new ArrayList<>();
        }

        public void addBankAccount(Account customarAccount) {
            this.accountList.add(customarAccount);
        }

        public void displayCustomerInfo() {
            System.out.println("Name :" + this.name + " Id:" + this.id + " ");
            for (Account account : this.accountList) {
                System.out.println("Account No. " + account.getAccountNumber() + "  Balance " + account.getBalance());
            }
        }

        public void depositAccount(int amount, int accountNumber) {
            boolean haveAnyAccount = false;
            for (Account account : this.accountList) {
                if (account.getAccountNumber() == accountNumber) {
                    account.deposit(amount);
                    haveAnyAccount = true;
                }
            }
            if (!haveAnyAccount) {
                System.out.println("Account number " + accountNumber + " does not exist");
            }
        }

        public void withdrawAccount(int amount, int accountNumber) {
            boolean haveAnyAccount = false;
            boolean canWithdraw = false;
            for (Account account : this.accountList) {
                if (account.getAccountNumber() == accountNumber) {
                    if (account.getBalance() >= amount) {
                        account.withdraw(amount);
                        canWithdraw = true;
                    } else {
                        canWithdraw = false;
                    }
                    haveAnyAccount = true;
                }
            }
            if (!haveAnyAccount) {
                System.out.println("Account number " + accountNumber + " does not exist");
            }
            if (!canWithdraw) {
                System.out.println("Account number " + accountNumber + " does not have enough money");
            }
        }
    }

    public static void main(String[] args) {

        Customer asifAhmed = new Customer("Asif Ahmed", 101);
        asifAhmed.addBankAccount(new Account(100, 1));
        asifAhmed.addBankAccount(new Account(200, 2));
        asifAhmed.depositAccount(500, 1);
        asifAhmed.withdrawAccount(100, 1);
        asifAhmed.displayCustomerInfo();

    }
}
