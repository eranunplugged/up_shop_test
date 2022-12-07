package com.up.up_shop_test.repository;

import com.up.up_shop_test.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Product, String> {
}
