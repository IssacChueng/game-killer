package com.jeff.gamekiller.model;

import lombok.Data;

import java.util.Date;

@Data
public class Game {

    private Integer gameId;

    private String gameName;

    private Date publishTime;

    private Integer publisher;

    private Integer series;

    private String officialWebSite;

    private Integer developer;
}
