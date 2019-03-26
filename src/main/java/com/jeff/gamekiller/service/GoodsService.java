package com.jeff.gamekiller.service;

import javax.validation.constraints.NotBlank;

public interface GoodsService {
    Integer goodsCount(Integer goodsId);

    Integer goodsBuy(Integer goodsId, Integer count);
}
