package view;

import builder.MemberBuilder;
import model.MemberDTO;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, 주소, 직업 순으로 입력\n");
        MemberDTO member = new MemberBuilder()
                .username(sc.next())
                .password(sc.next())
                .passwordCheck(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build()
                ;
        System.out.printf(member.toString());
    }
}
