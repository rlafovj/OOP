package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {
    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}

    public static UtilService getInstance(){
        return instance;
    }
    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        return start + ((int)(Math.random() * gapBetweenStartAndEnd));
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return Math.round(start + Math.random() * gapBetweenStartAndEnd) * 10 / 10.0;
    }

    @Override
    public String createRandomName() {
        String[] names = {"이정재", "마동석", "송강호", "윤여정", "황정민"
                , "정우성", "이병헌", "현 빈", "유해진", "손석구"
                , "전도연", "손예진", "하지원", "김하늘", "송중기"
                , "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return names[createRandomInteger(0, 20)];
    }

    @Override
    public String createRandomTitle() {
        String[] titles = {"법관은 헌법과", "재판의 전심절차", "국정의 중요한", "민주평화통일자문회의의", "대통령·국무총리",
                "모든 국민은 ", "대통령은 전시",  "국무총리는 대통령을", "형사피고인은 유죄의",  "국가는 농수산물의"};
        return titles[createRandomInteger(0, 9)];
    }

    @Override
    public String createRandomContent() {
        String[] content = {"법관은 헌법과 법률에 의하여 그 양심에 따라 독립하여 심판한다.",

                "재판의 전심절차로서 행정심판을 할 수 있다. 행정심판의 절차는 법률로 정하되, 사법절차가 준용되어야 한다.",

                "국정의 중요한 사항에 관한 대통령의 자문에 응하기 위하여 국가원로로 구성되는 국가원로자문회의를 둘 수 있다.",

                "민주평화통일자문회의의 조직·직무범위 기타 필요한 사항은 법률로 정한다.",

                "대통령·국무총리·국무위원·행정각부의 장·헌법재판소 재판관·법관·중앙선거관리위원회 위원·감사원장·감사위원 기타 법률이 정한 공무원이 그 직무집행에 있어서 헌법이나 법률을 위배한 때에는 국회는 탄핵의 소추를 의결할 수 있다.",

                "모든 국민은 자기의 행위가 아닌 친족의 행위로 인하여 불이익한 처우를 받지 아니한다.",

                "대통령은 전시·사변 또는 이에 준하는 국가비상사태에 있어서 병력으로써 군사상의 필요에 응하거나 공공의 안녕질서를 유지할 필요가 있을 때에는 법률이 정하는 바에 의하여 계엄을 선포할 수 있다.",

                "국무총리는 대통령을 보좌하며, 행정에 관하여 대통령의 명을 받아 행정각부를 통할한다.",

                "형사피고인은 유죄의 판결이 확정될 때까지는 무죄로 추정된다.",

                "국가는 농수산물의 수급균형과 유통구조의 개선에 노력하여 가격안정을 도모함으로써 농·어민의 이익을 보호한다."
        };
        return content[createRandomInteger(0, 9)];
    }

    @Override
    public String createRandomCompany() {
        String[] companise = {"구글", "엔비디아", "메타", "삼성", "LG", "애플"};
        return companise[createRandomInteger(0, 5)];
    }

    @Override
    public String createRandomUsername() {
        //char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String username = "";                   //{"Alpha", "Bravo", "Charlie", "Delta", "Foxtrot"}
        for(int i = 0; i < 5; i++){
        username += String.valueOf((char)('a' + this.createRandomInteger(0, 26)));

        }
        return username;
    }


}
