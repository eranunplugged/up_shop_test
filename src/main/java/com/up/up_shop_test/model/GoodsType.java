package com.up.up_shop_test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("goods_type")
public record GoodsType(
        @Id String id,
        String type) {

}
