package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString(exclude = {"id"})
public class Member {
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

    @Builder(builderMethodName = "builder")
    public Member(String username, String password, String passwordCheck, String name, String  residentRegistrationNumber, String phoneNumber, String address, String job, double height, double weight) {
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

}
