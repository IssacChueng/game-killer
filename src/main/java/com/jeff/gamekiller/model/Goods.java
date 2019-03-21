package com.jeff.gamekiller.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {

    private Integer goodsId;

    private String goodsName;

    private Integer goodsType;

    private Integer gameId;

    private BigDecimal price;
}
