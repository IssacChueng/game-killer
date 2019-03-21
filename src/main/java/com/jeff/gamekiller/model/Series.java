package com.jeff.gamekiller.model;

import lombok.Data;

import java.util.Date;

@Data
public class Series {

    private Integer seriesId;

    private String seriesName;

    private Date firstPublishTime;

}
