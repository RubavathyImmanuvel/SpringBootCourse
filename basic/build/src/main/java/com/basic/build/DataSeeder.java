package com.basic.build;

import com.basic.build.models.Product;
import com.basic.build.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {//to seed demo data
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String ...args) throws Exception {
        //check if the table is empty
        if (productRepository.count() == 0) {
            //seed demo data
            List<Product> products = Arrays.asList(
                new Product("name", 100.12, "description", 9, "category", "seller", 7, 5, Arrays.asList("https://picsum.photos/id/237/200/300"))
            );
            productRepository.saveAll(products);
            System.out.println("Demo data seeded");
        }
    }
}

