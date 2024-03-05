package service;

import model.Member;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    Map<String, ?> join(Scanner sc);
    String login(Scanner sc);
    Map<String, ?> addUsers();
    Map<String, ?> getUserMap();
    int count();
    String deleteuser(String deleteUsername);
    String changePassword(Scanner sc);
    List<?> findByName(Scanner sc);
    Member findByUsername(String username);
}
