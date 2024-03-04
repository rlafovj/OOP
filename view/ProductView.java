package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        for(int i = 0; i < 5; i++) {
            product.add(Product.builder()
                    .pno(i+1)
                    .name(util.createRandomName())
                    .company(util.createRandomCompany())
                    .price(util.createRandomInteger(0, 10000))
                    .build()
            );
        }

        product.forEach(i ->{
            System.out.println(i.toString());
        });
    }
}
