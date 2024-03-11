package strategy;

import view.Index;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

enum Grade{
  A(score -> score >= 90),
  B(score -> score >= 80 && score < 90),
  C(score -> score >= 70 && score < 80),
  D(score -> score >= 60 && score < 70),
  E(score -> score >= 50 && score < 60),
  F(score -> score <= 40);

  private final Predicate<Integer> predicate;

  Grade(Predicate<Integer> predicate) {
    this.predicate = predicate;
  }
  static String getGrade(int score){
    return getScore(score)+"";
  }

  private static Grade getScore(int inputNum) {
    return Arrays.stream(values())
            .filter(o -> o.predicate.test(inputNum))
            .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
  }
}
public class GradeMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Score");
    System.out.println(Grade.getGrade(sc.nextInt()));
  }
}
