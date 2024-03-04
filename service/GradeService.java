package service;

import model.Subject;

public interface GradeService {
    public int createTotalScore(Subject subject);
    public double createAverage(int totalSum);
}
