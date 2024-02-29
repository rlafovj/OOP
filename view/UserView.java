package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController ctrl = new UserController();
        ctrl.addUser();
        while (true){
            System.out.println("메뉴\n0-종료 \n1-회원가입\n2-로그인\n3-회원수\n4-비밀번호변경\n5-탈퇴\n6-회원목록\n7-이름검색\n8-직업검색\n9-ID검색");
            switch (sc.next()){
                case "0":
                    System.out.println("종료"); return;
                case "1":
                    System.out.println("회원가입");
                    ctrl.join(sc);
                    break;
                case "2":
                    System.out.println("로그인");
                    System.out.println(ctrl.login(sc));
                    break;
                case "3":
                    System.out.println("회원수");
                    System.out.printf("회원수는 %d 명 입니다.\n", ctrl.count());
                    break;
                case "4":
                    System.out.println("비밀번호변경");
                    System.out.println(ctrl.changePassword(sc));
                    break;
                case "5":
                    System.out.println("탈퇴");
                    System.out.print("삭제할 ID : ");
                    System.out.println(ctrl.deleteUser(sc));
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.printUserList();
                    break;
                case "7":
                    System.out.println("이름검색");
                    ctrl.findByName(sc).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "8":
                    System.out.println("직업검색");
                    ctrl.findByJob(sc).forEach((k, v)->{
                        System.out.println(v);
                    });
                    break;
                case "9":
                    System.out.println("ID검색");
                    System.out.print("검색할 ID : ");
                    System.out.println(ctrl.findByUsername(sc));
                    break;
            }
        }
    }
}
