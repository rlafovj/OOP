package service;

import model.MemberDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    Map<String, MemberDTO> join(Scanner sc);
    String login(Scanner sc);
    Map<String, MemberDTO> addUsers();
    MemberDTO findUserById(String username);

    Map<String, MemberDTO> getUserMap();
    int count();
}
