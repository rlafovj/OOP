package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, MemberDTO> users;
    Map<String , MemberDTO> map = new HashMap<>();

    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }
    UtilService util = UtilServiceImpl.getInstance();

    public static AuthService getInstance(){
        return instance;
    }
    @Override
    public String join() {
        return null;
    }

    @Override
    public String login(Scanner sc) {
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
        return null;
    }

    @Override
    public Map<String, MemberDTO> addUsers() {
        for(int i = 0; i < 5; i++){
            String randomUsername = util.createRandomUsername();
            map.put(randomUsername, new MemberBuilder()
                        .username(randomUsername)
                        .password("1")
                        .passwordCheck("1")
                        .name(util.createRandomName())
                        .build());
        }
        users = map;
        return map;
    }

    @Override
    public MemberDTO findUser(String username) {
        MemberDTO user = new MemberBuilder()
                .build();
        return user;
    }

    @Override
    public Map<String, MemberDTO> getUserMap() {
        //users.forEach(k, v)->System.out.println("{"+K+","+v+);
        return users;
    }

    @Override
    public int count() {
        return users.size();
    }


}
