package Collections;

public class BankingSystemInitializer {

    long bankID;
    String bankName;
    long bankbalance;

    public BankingSystemInitializer(long bankID, String bankName, long bankbalance) {

        System.out.println("initialization process has begun");
        System.out.println("Banking Process has started,");
        this.bankID = bankID;
        this.bankName = bankName;
        this.bankbalance = bankbalance;
    }

    public void printBankDetails(){
     System.out.println("Bank ID: "+bankID);
    System.out.println("Bank Name: "+bankName);
    System.out.println("Bank Balance: "+bankbalance);
    }

    public static void main(String[] args) {
        BankingSystemInitializer bank = new BankingSystemInitializer(448742310873423262L, "Fedral\n" +
                "\t\t\tBank of India", 98385354265735737L);
        bank.printBankDetails();
    }
}
