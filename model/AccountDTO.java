package model;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountDTO {
  private long id;
  private String accountNumber;
  private String accountHolder;
  private double balance;
  private LocalDate transactionDate;
}