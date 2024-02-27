//package controller;
//
//import model.MemberDTO;
//import service.AuthService;
//import serviceImpl.AuthServiceImpl;
//
//import java.util.Map;
//import java.util.Scanner;
//
//public class AuthController {
//
//    AuthService auth;
//
//    public AuthController() {
//        this.auth = AuthServiceImpl.getInstance();
//    }
//
//    public String join() {
//        return auth.join();
//    }
//    public String login(Scanner sc) {
//        return auth.login(sc);
//    }
//    public Map<String, MemberDTO> addUsers() {
//        return auth.addUsers();
//    }
//    public void findUser(String username) {
//        auth.findUser(username);
//    }
//
//    public Map<String , MemberDTO> getUserMap(){
//        return auth.getUserMap();
//    }
//}
