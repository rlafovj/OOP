package controller;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;

import java.util.List;
import java.util.Scanner;

public class AccountController {
  AccountService accountService;

  public String  id(Scanner sc){
    return accountService.deposit(new AccountBuilder()
                    .id(sc.nextLong())
                    .accountNumber(sc.next())
                    .accountHolder(sc.next())
                    .balance(sc.nextDouble())
                    .transactionDate(null)
            .build()
    );
  }

  public String  createAccount(Scanner sc) {
    return accountService.createAccount(new AccountBuilder()
            .id(sc.nextLong())
            .accountNumber(sc.next())
            .accountHolder(sc.next())
            .balance(sc.nextDouble())
            .transactionDate(null)
            .build()
    );
  }

  public String  deposit(Scanner sc) {
    return accountService.deposit(new AccountBuilder()
            .id(sc.nextLong())
            .accountNumber(sc.next())
            .accountHolder(sc.next())
            .balance(sc.nextDouble())
            .transactionDate(null)
            .build()
    );
  }

  public String  withdraw(Scanner sc) {
    return accountService.withdraw(new AccountBuilder()
            .id(sc.nextLong())
            .accountNumber(sc.next())
            .accountHolder(sc.next())
            .balance(sc.nextDouble())
            .transactionDate(null)
            .build()
    );
  }

  public String getBalance(Scanner sc){
    return accountService.getBalance(sc.next());
  }

  public String  removeAccount(Scanner sc) {
    return accountService.removeAccount(sc.next());
  }

  public List<AccountDTO> getAccount(){
    return null;
  }
}
