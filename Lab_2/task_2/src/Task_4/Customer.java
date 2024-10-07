package Task_4;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int customerID;
    List<BankAccount> accountList;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void addBankAccount(BankAccount customerAccount) {
        this.accountList.add(customerAccount);
    }

    public void information() {
        System.out.println("Name :" + this.name + " Id:" + this.customerID);
        for (BankAccount account : this.accountList) {
            System.out.println("Account No. " + account.getAccountNumber() + "  Balance " + account.getBalance());
        }
    }

    public void depositMoney(int amount, int accountNumber) {
        boolean haveAnyAccount = false;
        for (BankAccount account : this.accountList) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                haveAnyAccount = true;
            }
        }
        if (!haveAnyAccount) {
            System.out.println("Account number " + accountNumber + " does not exist");
        }
    }

    public void withdrawMoney(int amount, int accountNumber) {
        boolean haveAnyAccount = false;
        boolean canWithdraw = false;
        for (BankAccount account : this.accountList) {
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
