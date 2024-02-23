package serviceImpl;

import model.SubjectDTO;
import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return instance;
    }


    @Override
    public int createTotalScore(SubjectDTO subject) {
        return subject.getKorean() + subject.getEnglish() + subject.getMath();
    }

    @Override
    public double createAverage(int totalSum) {
        return (double) totalSum /3;
    }
}
