package Service.impl;

import Domain.Account;
import Service.BankService;

import java.util.UUID;

public class BankServiceimpl implements BankService {



    @Override
    public String openAccount(String name, String email, String accountType) {

        String Customerid = UUID.randomUUID().toString();

        String accountNumber = UUID.randomUUID().toString();

        Account a = new Account(accountNumber,accountType,0,Customerid);

        return null;
    }
}
