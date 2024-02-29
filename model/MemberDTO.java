package model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private int id;
    private String username;
    private String password;
    private String passwordCheck;
    private String name;
    private String residentRegistrationNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    public MemberDTO(String username, String password, String passwordCheck, String name, String  residentRegistrationNumber, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.name = name;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("ID : "+username+
                "\n비밀번호 : "+password+
                "\n비밀번호확인 : "+passwordCheck+
                "\n이름 : "+name+
                "\n주민번호 : "+residentRegistrationNumber+
                "\n전화번호 : "+phoneNumber+
                "\n주소 : "+address+
                "\n직업 : "+job+
                "\n키 : "+height+
                "\n몸무게 : "+weight);
    }
}
