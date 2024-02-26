package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("--------- 집전화 ---------");
        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone.toString());
        System.out.println("--------- 휴대전화 ---------");
        CelPhone cp = new CelPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp.toString());
        System.out.println("--------- 아이폰 ---------");
        IPhone ip = new IPhone();
        ip.setCompany("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("전송하다");
        System.out.println(ip.toString()); // 애플 아이폰으로 톰에게 데이터를 전송하다
        System.out.println("--------- 갤럭시 ---------");
        AndroidPhone ap = new AndroidPhone();
        ap.setCompany("삼성");
        ap.setCall("제인");
        ap.setPortable(true);
        ap.setSize("10인치");
        ap.setData("전송하다");
        System.out.println(ap.toString());

    }
}

class AndroidPhone extends IPhone{
    private String size;
    public static String BRAND = "갤럭시 노트";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AndroidPhone{" +
                "제조사='" + company + '\n' +
                BRAND + '\'' +
                ", 수신자='" + call + '\n' +
                "이동성=" + portable +
                ", 사이즈=" + size + '\n' +
                ", 이동유무='" + move + '\n' +
                "데이터='" + data + '\n' +
                '}';
    }
}

class IPhone extends CelPhone{
  protected String data;
  public static String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "제조사='" + super.company + '\n' +
                BRAND + '\'' +
                ", 수신자='" + super.call + '\n' +
                "이동성=" + super.portable +
                ", 이동유무='" + super.move + '\n' +
                "데이터='" + data + '\n' +
                '}';
    }
}

class CelPhone extends Phone{
    protected boolean portable;
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if(portable){
            this.setMove("폰을 휴대할 수 있음");
        }else {
            this.setMove("폰을 휴대할 수 있음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대전화{" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                "이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}

class Phone{
    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}
