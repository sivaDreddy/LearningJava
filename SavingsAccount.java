package Collections;

public class SavingsAccount extends Account {

    private float interestRate;

    public SavingsAccount(long accountNumber, float interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public long deposit(long amount) {
        if (amount > 0) {
            bankAccountWithABalance += amount;
        }
        return bankAccountWithABalance;
    }

    @Override
    public long getBankAccountWithABalance() {
        return (long)(bankAccountWithABalance * (1 + interestRate));
    }

    public float getInterestRate() {
        return interestRate;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456789, 0.05f);
        savingsAccount.deposit(8000);
        System.out.println("Account number: " + savingsAccount.getAccountNumber());
        System.out.println("Interest rate: " + savingsAccount.getInterestRate());
        System.out.println("Balance after deposit with interest: " + savingsAccount.getBankAccountWithABalance());
    }
}
