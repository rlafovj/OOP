package view;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.print("이름 : \n국어점수 : \n영어점수 : \n수학점수 : \n평균 점수를 구하시오\n");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        Member student = Member.builder()
                .name(sc.next())
                .build()
                ;

        Subject subjects = Subject.builder()
                .korean(util.createRandomInteger(0, 100))
                .english(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build()
                ;

        int totalSum = grade.createTotalScore(subjects);
        double average = grade.createAverage(totalSum);

        System.out.printf(" ============= 성적표 ==============\n 이름 : %s\n 국어점수 : %d" +
                "\n 영어점수 : %d\n 수학점수 : %d\n 총점 : %d\n 평균 : %.1f"
                , student.getName(), subjects.getKorean(), subjects.getEnglish(), subjects.getMath(), totalSum, average);

    }
}
