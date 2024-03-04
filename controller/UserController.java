package controller;

import model.Member;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.*;

public class UserController {

    private Map<String, Member> users;

    public UserController() {
        this.users = new HashMap<>();
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

    public List<Member> findByName(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.findByName(sc);
    }

    public Map<String, Member> findByJob(Scanner sc) {
        return null;
    }

    public Member findByUsername(Scanner sc) {
        this.auth = AuthServiceImpl.getInstance();
        return auth.findByUsername(sc.next());
    }
}


