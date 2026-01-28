package Domain;

import java.time.LocalDateTime;
import java.util.PropertyResourceBundle;

public class Transaction {

    private String Id;
    private Type type;
    private String accountNumber;
    private double amount;
    private LocalDateTime Timestamp;

    private String Note;

    public Transaction(String id, Type type, String accountNumber, double amount, LocalDateTime timestamp, String note) {
        Id = id;
        this.type = type;
        this.accountNumber = accountNumber;
        this.amount = amount;
        Timestamp = timestamp;
        Note = note;
    }
}
