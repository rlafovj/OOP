package controller;

import model.MemberDTO;
import service.AuthService;
//import service.UserService;
import serviceImpl.AuthServiceImpl;
//import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController {

    private Map<String, MemberDTO> users;
//    private List<MemberDTO> userList;

    public UserController() {
        this.users = new HashMap<>();
//        this.userList = new ArrayList<>();
    }

    AuthService auth;


    public void addUser(){
        this.auth = AuthServiceImpl.getInstance();
        users = auth.addUsers();
    }

    public void findUser(String username){
        if(users.containsKey(username)){
            System.out.println(users.get(username));
        }else System.out.println("입력값과 일치하는 키가 없습니다.");
    }

    public void printUserList(){
//        for(Map.Entry<String, MemberDTO> entry : users.entrySet()) {
//            System.out.println(entry.getValue());
//        }
        users.forEach((key, value) -> System.out.println(value));
    }
    public void count(){
        this.auth = AuthServiceImpl.getInstance();
        System.out.printf("회원수는 %d 명 입니다.", auth.count());
    }
}


