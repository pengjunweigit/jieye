package cn.kgc.mapper;

import cn.kgc.domain.Products;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface ProductsMapper {
    @Insert("insert into products values(null,#{productName},#{productDare},#{productDesc },#{productSum},#{productPrice})")
    Integer insert(Products products);

    List<Products> query();
}
