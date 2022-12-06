package com.up.up_shop_test.controller;

import com.up.up_shop_test.dto.GoodsShotDto;
import com.up.up_shop_test.service.GoodsService;
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
@RequestMapping("/api/goods")
public class GoodsController {

    private final GoodsService goodService;

    @GetMapping
    public List<GoodsShotDto> getAllGoods() {

       return goodService.getAllGoods();
    }

}
