package service;

import model.Account;

import java.util.List;

public interface AccountService {
  String  createAccount(Account account);
  String  deposit(Account account);
  String  withdraw(Account account);
  String getBalance(String accountNumber);
  String  removeAccount(String accountNumber);
  List<Account> getAccounts();
}
