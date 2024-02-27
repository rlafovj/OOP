package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController ctrl = new UserController();
        ctrl.addUser();
        while (true){
            System.out.println("메뉴\n0-종료 \n1-회원가입\n2-로그인\n3-ID검색\n4-비번변경\n5-탈퇴\n6-회원목록\n7-이름검색\n8-직업검색");
            switch (sc.next()){
                case "0":
                    System.out.println("종료"); return;
                case "3":
                    System.out.println("회원수");
                    ctrl.count();
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.printUserList();
                    break;
            }
        }
    }
}
