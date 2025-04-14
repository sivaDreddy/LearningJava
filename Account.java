package Collections;

public abstract class Account {

    protected long bankAccountWithABalance;
    protected long accountNumber;
//changes are required
    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
        this.bankAccountWithABalance = 0;
    }
//move this file from local to github
    public long getBankAccountWithABalance() {
        return bankAccountWithABalance;
    }
//changes are done
    public abstract long deposit(long amount); // force subclasses to implement logic

    public long getAccountNumber() {
        return accountNumber;
    }
}
