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
}
