package com.example.demo.dao;

import com.example.demo.enity.ShopCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCategoryMapper {

    int deleteByPrimaryKey(Integer shopCategoryId);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    ShopCategory selectByPrimaryKey(Integer shopCategoryId);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}