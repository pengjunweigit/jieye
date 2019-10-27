package cn.kgc.service;

import cn.kgc.domain.Products;
import cn.kgc.domain.Qualities;

import java.util.List;

public interface ProductsService {
    List<Qualities> query();
    Integer insert(Products products);
    List<Products> queryAll();
}
