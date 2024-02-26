package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    //카우프 지수 구하는 프로그램
    public static void main(Scanner sc){
        UtilService util = UtilServiceImpl.getInstance();
        MemberDTO member = new MemberBuilder()
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomDouble(30, 70))
                .build()
                ;
        KaupService kaufS = KaupServiceImpl.getInstance();

        System.out.printf("키 : %.1f\n몸무게 : %.1f\n" +
                "BMI : %s\n BodyMass : %s", member.getHeight(),
                member.getWeight(), kaufS.createBMI(member), kaufS.createBodyMass(kaufS.createBMI(member)));
    }
}
