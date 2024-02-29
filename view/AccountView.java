package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {
  public static void main(Scanner sc) {
    AccountController accountController = new AccountController();

    while (true){
      System.out.println("[Account] 0-Exit 1-CreateAccount 2-Deposit 3-Withdraw 4-Balance 5-RemoveAccount 6-getAccounts");
      switch (sc.next()){
        case "0":
          return;
        case "1":
          System.out.println("CreateAccount");
          System.out.println(accountController.createAccount(sc));
          break;
        case "2":
          System.out.println("Deposit");
          System.out.println(accountController.deposit(sc));
          break;
        case "3":
          System.out.println("Withdraw");
          System.out.println(accountController.withdraw(sc));
          break;
        case "4":
          System.out.println("Balance");
          System.out.println(accountController.getBalance(sc));
          break;
        case "5":
          System.out.println("RemoveAccount");
          System.out.println(accountController.removeAccount(sc));
          break;
        case "6":
          System.out.println("GetAccounts");
          accountController.getAccount();
          break;
      }
    }
  }
}
