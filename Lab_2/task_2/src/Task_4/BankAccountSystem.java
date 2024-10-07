package Task_4;

public class BankAccountSystem {

    public static void main(String[] args) {
        Customer asifAhmed = new Customer("Asif Ahmed", 101);

        asifAhmed.addBankAccount(new BankAccount(100, 1));
        asifAhmed.addBankAccount(new BankAccount(200, 2));
        asifAhmed.depositMoney(500, 100);  // Corrected account number
        asifAhmed.withdrawMoney(100, 100); // Corrected account number
        asifAhmed.information();
    }
}
