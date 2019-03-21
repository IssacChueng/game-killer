package com.jeff.gamekiller.model;

import lombok.Data;

import java.util.Date;

@Data
public class Shop {

    private Integer shopId;

    private String shopName;

    private Date createTime;

    private Integer owner;

    private Date updateTime;

    private Integer level;
}
