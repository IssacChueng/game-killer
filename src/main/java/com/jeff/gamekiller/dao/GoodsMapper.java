package com.jeff.gamekiller.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface GoodsMapper {

    @Update(value = "UPDATE t_goods set GOODS_COUNT = GOODS_COUNT - #{count} where GOODS_ID = #{goodsId}")
    int updateCount(Integer goodsId, Integer count);

    @Select(value = "SELECT GOODS_COUNT FROM t_goods WHERE GOODS_ID = #{goodsId} FOR UPDATE")
    int selectCount(Integer goodsId);
}
