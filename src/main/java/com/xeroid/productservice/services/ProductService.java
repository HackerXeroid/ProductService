package com.xeroid.productservice.services;


import com.xeroid.productservice.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
