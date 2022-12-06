package com.up.up_shop_test.service;

import com.up.up_shop_test.dto.GoodsShotDto;
import com.up.up_shop_test.model.Goods;
import com.up.up_shop_test.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Created by andre on 12/5/2022
 */
@Service
@RequiredArgsConstructor
public class GoodsServiceImpl implements GoodService{

    private final GoodsRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GoodsShotDto> getAllGoods() {

        List<Goods> goodsList = repository.findAll();

        return  goodsList.stream()
                .map(entity -> mapper.map(entity, GoodsShotDto.class))
                .toList();
    }
}
