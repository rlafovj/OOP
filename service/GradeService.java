package service;

import model.SubjectDTO;

public interface GradeService {
    public int createTotalScore(SubjectDTO subject);
    public double createAverage(int totalSum);
}
