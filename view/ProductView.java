package view;

import builder.ProductBuilder;
import model.ProductDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        List<ProductDTO> product = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        for(int i = 0; i < 5; i++) {
            product.add(new ProductBuilder()
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
