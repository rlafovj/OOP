package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

  private static AccountService instance = new AccountServiceImpl();

  List<Account> accounts;

  private AccountServiceImpl() {
    this.accounts = new ArrayList<>();
  }

  public static AccountService getInstance() {
    return instance;
  }

  List<Account> list = new ArrayList<>();

  @Override
  public String createAccount(Account account) {
    return null;
  }

  @Override
  public String deposit(Account account) {
    return null;
  }

  @Override
  public String withdraw(Account account) {
    return null;
  }

  @Override
  public String getBalance(String accountNumber) {
    return null;
  }

  @Override
  public String removeAccount(String accountNumber) {
    return null;
  }

  @Override
  public List<Account> getAccounts() {
    return null;
  }
}
