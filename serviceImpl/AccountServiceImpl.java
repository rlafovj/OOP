package serviceImpl;

import model.AccountDTO;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

  private static AccountService instance = new AccountServiceImpl();

  List<AccountDTO> accounts;

  private AccountServiceImpl() {
    this.accounts = new ArrayList<>();
  }

  public static AccountService getInstance() {
    return instance;
  }

  List<AccountDTO> list = new ArrayList<>();

  @Override
  public String createAccount(AccountDTO account) {
    return null;
  }

  @Override
  public String deposit(AccountDTO account) {
    return null;
  }

  @Override
  public String withdraw(AccountDTO account) {
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
  public List<AccountDTO> getAccounts() {
    return null;
  }
}
