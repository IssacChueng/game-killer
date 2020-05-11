package com.jeff.gamekiller.service;

public interface GoodsService {
    Integer goodsCount(Integer goodsId);

    Integer goodsBuy(Integer goodsId, Integer count);
}
