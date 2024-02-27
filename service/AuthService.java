package service;

import model.MemberDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    public String join();
    public String login(Scanner sc);
    Map<String, MemberDTO> addUsers();
    MemberDTO findUser(String username);

    Map<String, MemberDTO> getUserMap();
    int count();
}
