package com.up.up_shop_test.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class ProductShortDto {
    String id;
    String name;
    String type;
}

