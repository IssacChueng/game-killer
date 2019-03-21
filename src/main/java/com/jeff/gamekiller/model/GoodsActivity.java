package com.jeff.gamekiller.model;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsActivity {

    private Integer activityId;

    private String activityName;

    private String activityDesc;

    private Date startTime;

    private Date endTime;

}
