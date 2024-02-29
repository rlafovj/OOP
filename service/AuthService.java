package service;

import model.MemberDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    Map<String, MemberDTO> join(Scanner sc);
    String login(Scanner sc);
    Map<String, MemberDTO> addUsers();
    Map<String, MemberDTO> getUserMap();
    int count();

    String deleteuser(String deleteUsername);

    String changePassword(Scanner sc);

    List<MemberDTO> findByName(Scanner sc);
    MemberDTO findByUsername(String username);
}
