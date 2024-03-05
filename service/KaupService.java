package service;

import model.Member;

public interface KaupService {
    String createBMI(Member member);
    String  createBodyMass(String bmi);
}
