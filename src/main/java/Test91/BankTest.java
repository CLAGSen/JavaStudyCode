package Test91;

import java.util.Map;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("1","曹");
        bank.addCustomer("2","曹");
        bank.getCustomer(0)
                .setAccount(new Account(100));
        bank.getCustomer(0)
                .getAccount()
                .withdraw(50);
        System.out.println(bank.getCustomer(0)
                .getAccount()
                .getBalance());
    }
}
