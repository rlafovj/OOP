package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, Member> users;
    List<?> userList;

    private AuthServiceImpl(){
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }
    UtilService util;

    public static AuthService getInstance(){
        return instance;
    }
    @Override
    public Map<String, Member> join(Scanner sc) {
        System.out.print("ID, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, 주소, 직업 순으로 입력\n");
        String username = sc.next();
        users.put(username, Member.builder()
                .username(username)
                .password(sc.next())
                .passwordCheck(sc.next())
                .name(sc.next())
                .residentRegistrationNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build())
                ;
        return users;
    }

    @Override
    public String login(Scanner sc) {
        String msg;
        System.out.print("ID : ");
        String inputUsername = sc.next();
        System.out.print("\nPassword : ");
        String inputPassword = sc.next();
        if(users.containsKey(inputUsername) && users.get(inputUsername).getPassword().equals(inputPassword)){
            msg = "로그인 성공\n";
        }else msg = "ID 또는 비밀번호가 틀렸습니다.\n";
        return msg;
    }

    @Override
    public Map<String, Member> addUsers() {
        for(int i = 0; i < 5; i++){
            this.util = UtilServiceImpl.getInstance();
            String randomUsername = util.createRandomUsername();
            users.put(randomUsername, Member.builder()
                        .username(randomUsername)
                        .password("1")
                        .passwordCheck("1")
                        .name(util.createRandomName())
                        .build());
        }
        return users;
    }

    @Override
    public Map<String, Member> getUserMap() {
        //users.forEach(k, v)->System.out.println("{"+K+","+v+);
        return users;
    }

    @Override
    public int count() {
        return users.size();
    }

    @Override
    public String deleteuser(String deleteUsername) {
        String msg;
        if(users.containsKey(deleteUsername)){
            users.remove(deleteUsername);
            msg = "삭제되었습니다.";
        }else msg = "일치하는 ID가 없습니다.";
        return msg;
    }

    @Override
    public String changePassword(Scanner sc) {
        String msg;
        System.out.print("ID : ");
        String inputUsername = sc.next();
        System.out.print("\nPassword : ");
        String inputPassword = sc.next();
        if(users.containsKey(inputUsername) && users.get(inputUsername).getPassword().equals(inputPassword)){
            System.out.print("변경할 비밀번호 입력 : ");
            users.get(inputUsername).setPassword(sc.next());
            System.out.print("비밀번호 확인 : ");
            users.get(inputUsername).setPasswordCheck(sc.next());
            msg = "비밀번호 변경 완료\n";
        }else msg = "ID 또는 비밀번호가 틀렸습니다.\n";
        return msg;
    }

    @Override
    public List<Member> findByName(Scanner sc) {
        System.out.print("찾으려는 이름 : ");
        String inputName = sc.next();

        return null;
    }

    @Override
    public Member findByUsername(String username) {
        return users.get(username);
    }


}
