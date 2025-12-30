package model;

import java.util.ArrayList;
import java.util.List;

public class BankModel {
    private List<Account> accounts;

    public BankModel() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a) { accounts.add(a); }
    public void removeAccount(int acNo) {
        accounts.removeIf(a -> a.getAccountNumber() == acNo);
    }
    public Account getAccount(int acNo) {
        for (Account a : accounts) if (a.getAccountNumber() == acNo) return a;
        return null;
    }
    public Account[] getAllAccounts() { return accounts.toArray(new Account[0]); }
}
