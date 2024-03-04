package service;

import model.Member;

public interface KaupService {
    public String createBMI(Member member);
    public String  createBodyMass(String bmi);
}
