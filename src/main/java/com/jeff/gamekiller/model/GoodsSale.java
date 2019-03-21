package com.jeff.gamekiller.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 打折
 */
@Data
public class GoodsSale {

    private Integer saleId;

    private Integer goodsId;

    private BigDecimal salePrice;

    private BigDecimal discount;

    private Integer stock;
}
