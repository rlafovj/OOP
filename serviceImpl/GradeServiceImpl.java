package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return instance;
    }


    @Override
    public int createTotalScore(Subject subject) {
        return subject.getKorean() + subject.getEnglish() + subject.getMath();
    }

    @Override
    public double createAverage(int totalSum) {
        return (double) totalSum /3;
    }
}
