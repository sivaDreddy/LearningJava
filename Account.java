package Collections;

public abstract class Account {

    protected long bankAccountWithABalance;
    protected long accountNumber;

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
        this.bankAccountWithABalance = 0;
    }

    public long getBankAccountWithABalance() {
        return bankAccountWithABalance;
    }

    public abstract long deposit(long amount); // force subclasses to implement logic

    public long getAccountNumber() {
        return accountNumber;
    }
}
