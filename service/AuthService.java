package service;

import model.Member;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    Map<String, Member> join(Scanner sc);
    String login(Scanner sc);
    Map<String, Member> addUsers();
    Map<String, Member> getUserMap();
    int count();
    String deleteuser(String deleteUsername);
    String changePassword(Scanner sc);
    List<Member> findByName(Scanner sc);
    Member findByUsername(String username);
}
