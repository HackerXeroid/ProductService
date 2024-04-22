package com.xeroid.productservice.controllers;

import com.xeroid.productservice.models.Product;
import com.xeroid.productservice.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    @Test
    void testValidProductId() {

        Product product = new Product(); // @1234
        product.setId(1L);
        product.setTitle("iphone 15");
        product.setPrice(100000.0);

        when(productService.getProductById(1L))
                .thenReturn(product);

        System.out.println(product.getImage());

        Product outputProduct = productController.getProductById(1L);

        System.out.println(product.getImage());
        System.out.println(outputProduct.getImage());

        System.out.println("DEBUG");
        assertEquals(product, outputProduct);
    }

    @Test
    void testInvalidProductId() {

    }

    @Test
    void getAllProducts() {
    }

    @Test
    void createProduct() {
    }
}
