package cn.kgc.service.impl;

import cn.kgc.domain.Products;
import cn.kgc.domain.Qualities;
import cn.kgc.mapper.ProductsMapper;
import cn.kgc.mapper.QualitiesMapper;
import cn.kgc.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    QualitiesMapper qualitiesMapper;
    @Autowired
    ProductsMapper productsMapper;

    @Override
    public List<Qualities> query() {
        return qualitiesMapper.query();
    }

    @Override
    public Integer insert(Products products) {
        return productsMapper.insert(products);
    }

    @Override
    public List<Products> queryAll() {
        return productsMapper.query();
    }
}
