package builder;

import model.MemberDTO;

public class MemberBuilder {
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

    public MemberBuilder username(String username){
        this.username = username;
        return this;
    }

    public MemberBuilder password(String password){
        this.password = password;
        return this;
    }

    public MemberBuilder passwordCheck(String passwordCheck){
        this.passwordCheck = passwordCheck;
        return this;
    }

    public MemberBuilder name(String name){
        this.name = name;
        return this;
    }

    public MemberBuilder residentRegistrationNumber(String residentRegistrationNumber){
        this.residentRegistrationNumber = residentRegistrationNumber;
        return this;
    }

    public MemberBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MemberBuilder address(String address){
        this.address = address;
        return this;
    }

    public MemberBuilder job(String job){
        this.job = job;
        return this;
    }

    public MemberBuilder height(double height){
        this.height = height;
        return this;
    }

    public MemberBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public MemberDTO build(){
        return new MemberDTO(username, password, passwordCheck, name, residentRegistrationNumber, phoneNumber, address, job, height, weight);
    }
}
