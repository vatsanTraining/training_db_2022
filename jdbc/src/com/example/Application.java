package com.example;

import com.example.dao.ProductService;
import com.example.entity.Product;
import com.example.utils.ConnectionFactory;

import java.sql.Connection;

public class Application {

    public static void main(String[] args) {

        Connection con = ConnectionFactory.getPostgressConnection();

        ProductService service = new ProductService(con);


        Product toAdd = new Product(94987, "webcamera", 12470.00);

        //int rowAdded= service.addProduct(toAdd);

        //System.out.println("Row Added :="+rowAdded);


         service.findAll().forEach(System.out::println);
    }


}
