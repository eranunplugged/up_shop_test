package com.up.up_shop_test.controller;

import com.up.up_shop_test.dto.ProductShortDto;
import com.up.up_shop_test.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Created by andre on 12/5/2022
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductShortDto> getAllProducts() {

        return productService.getAllProducts();
    }

}
