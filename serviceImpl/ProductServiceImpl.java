package serviceImpl;

import service.ProductService;
import service.UtilService;

public class ProductServiceImpl implements ProductService {
    private static ProductService instance = new ProductServiceImpl();

    private ProductServiceImpl(){}

    public static ProductService getInstance(){
        return instance;
    }

}
