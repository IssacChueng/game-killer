package com.jeff.gamekiller.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GameItemDTO {

    /**
     * 游戏id
     */
    private Integer gameId;

    /**
     * 游戏名
     */
    private String gameName;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 发行商
     */
    private String publisher;

    /**
     * 类别
     */
    private List<String> categories;

    /**
     * 系列，如孤岛危机
     */
    private String series;

    /**
     * 官方网址
     */
    private String officialWebSite;

    /**
     * 游民星空地址
     */
    private String gamerskyLink;
}
