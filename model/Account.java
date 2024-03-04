package model;
import java.time.LocalDate;
import lombok.*;

@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})
public class Account {
  private long id;
  private String accountNumber;
  private String accountHolder;
  private double balance;
  private LocalDate transactionDate;

  @Builder(builderMethodName = "builder")
  public Account(long id, String accountNumber, String accountHolder, double balance, LocalDate transactionDate) {
    this.id = id;
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
    this.transactionDate = transactionDate;
  }
}