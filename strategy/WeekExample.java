package strategy;


import java.util.Scanner;
import java.util.function.Supplier;

enum DayName{
  Sunday{
    @Override
    public String apply() {
      return "일요일";
    }
  },
  Monday{
    @Override
    public String apply() {
      return "월요일";
    }
  },
  Tuesday{
    @Override
    public String apply() {
      return "화요일";
    }
  },
  Wednesday{
    @Override
    public String apply() {
      return "수요일";
    }
  },
  Thursday{
    @Override
    public String apply() {
      return "목요일";
    }
  },
  Friday{
    @Override
    public String apply() {
      return "금요일";
    }
  },
  Saturday{
    @Override
    public String apply() {
      return "토요일";
    }
  };
  public abstract String apply();
}
public class WeekExample {
  public static String EnglishToKorean(DayName dayName){
    return dayName.apply();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("요일");
    System.out.println(WeekExample.EnglishToKorean(DayName.valueOf(sc.next())));
  }
}
