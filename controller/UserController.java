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

    public void join(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        auth.join(sc);
    }

    public String login(Scanner sc){
        this.auth = AuthServiceImpl.getInstance();
        return auth.login(sc);
    }

    public void findUser(String username){
        if(users.containsKey(username)){
            System.out.println(users.get(username));
        }else System.out.println("입력값과 일치하는 키가 없습니다.");
    }

    public void printUserList(){
        users.forEach((key, value) -> {
            System.out.println(value);
            System.out.println();
        });
    }
    public int count(){
        this.auth = AuthServiceImpl.getInstance();
        return auth.count();
    }

    public String deleteUser(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.deleteuser(sc.next());
    }

    public String  changePassword(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.changePassword(sc);
    }

    public List<MemberDTO> findByName(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.findByName(sc);
    }

    public Map<String, MemberDTO> findByJob(Scanner sc) {
        return null;
    }

    public MemberDTO findByUsername(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.findByUsername(sc.next());
    }
}


