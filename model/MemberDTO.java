package model;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordCheck() {
        return passwordCheck;
    }

    public void setPasswordCheck(String passwordCheck) {
        this.passwordCheck = passwordCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidentRegistrationNumber() {
        return residentRegistrationNumber;
    }

    public void setResidentRegistrationNumber(String  residentRegistrationNumber) {
        this.residentRegistrationNumber = residentRegistrationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
