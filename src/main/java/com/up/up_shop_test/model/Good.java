package com.up.up_shop_test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/*
 * Created by andre on 12/5/2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("goods")
public class Good {

        @Id String id;
        private String name;
        private Long price;
        private String description;
        @Field("url_pic")
        private String urlPic;
        @DBRef
        private GoodType type;

}



