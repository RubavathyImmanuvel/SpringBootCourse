package com.basic.build.controllers;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

import com.basic.build.models.Product;
import com.basic.build.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products") //appends products in the url
public class ProductController {
        @Autowired
        private ProductService productService;

        //@GetMapping("/products")
        //@GetMapping("")

//        public List<Map<String, Object>> getAllProducts() {
//            return Arrays.asList(
//                    Map.of("name", "product 1", "price", 123),
//                    Map.of("name", "product 2", "price", 321)
//            );
//        }

        @GetMapping("")
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

    //@GetMapping("/products/category")
    @GetMapping("/category")
    public List<Map<String, Object>> getCategoryProducts() {
        return Arrays.asList(
                Map.of("name", "product 1", "price", 123),
                Map.of("name", "product 2", "price", 321)
        );
    }
}
