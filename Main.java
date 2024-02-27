import service.UtilService;
import serviceImpl.UtilServiceImpl;
import view.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();

        while (true){
            System.out.println("0-종료 1-회원관리 2-성적표 3-게시판 4-카우프 5-사용자관리(맵)");
            switch (sc.next()) {
                case "0":
                    return;
                case "1":
                    AuthView.main(sc);
                    break;
                case "2":
                    GradeView.main(sc);
                    break;
                case "3":
                    BoardView.main();
                    break;
                case "4":
                    KaupView.main(sc);
                    break;
                case "5":
                    UserView.main(sc);
                    break;
            }
        }
    }
}
