package Domain;

public class Account {

    private String accountNumber;
    private String customerId;
    private  double balance;
    private  String acoountType;

    public Account(String accountNumber, String customerId, double balance, String acoountType) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.acoountType = acoountType;
    }
}
