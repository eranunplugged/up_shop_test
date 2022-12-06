package com.up.up_shop_test.repository;

import com.up.up_shop_test.model.Goods;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoodsRepository extends MongoRepository<Goods, String> {
}
