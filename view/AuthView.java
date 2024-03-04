package view;

import model.Member;

import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc){
        System.out.print("ID, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, 주소, 직업 순으로 입력\n");
        Member member = Member.builder()
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
