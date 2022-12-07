package com.up.up_shop_test.service;

import com.up.up_shop_test.dto.ProductShortDto;
import com.up.up_shop_test.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * Created by andre on 12/5/2022
 */
@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductsRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<ProductShortDto> getAllProducts() {

        var products = repository.findAll();

        return products.stream()
                .map(entity -> mapper.map(entity, ProductShortDto.class))
                .toList();
    }
}
