package service;

import model.MemberDTO;

public interface KaupService {
    public String createBMI(MemberDTO member);
    public String  createBodyMass(String bmi);
}
