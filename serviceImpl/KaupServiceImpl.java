package serviceImpl;

import model.MemberDTO;
import service.KaupService;

public class KaupServiceImpl implements KaupService{
    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public String createBMI(MemberDTO member) {
        double height = member.getHeight();
        double weight = member.getWeight();
        double bmi = (weight / ((height/100) * (height/100)));
        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double bmi2 = Double.parseDouble(bmi);
        String bodyMass;
        if(bmi2 < 18.5) {
            bodyMass = "저체중";
        } else if (bmi2<22.5) {
            bodyMass = "정상";
        }else{
            bodyMass = "과체중";
        }
        return bodyMass;
    }
}
