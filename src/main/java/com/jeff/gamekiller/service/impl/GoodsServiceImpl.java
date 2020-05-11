package com.jeff.gamekiller.service.impl;

import com.jeff.gamekiller.ex.CommonException;
import com.jeff.gamekiller.dao.GoodsMapper;
import com.jeff.gamekiller.enm.StatusCode;
import com.jeff.gamekiller.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public Integer goodsCount(Integer goodsId) {
        int count = goodsMapper.selectCount(goodsId);
        if (count < 0) {
            throw new CommonException("", StatusCode.NO);
        }
        return count;
    }

    @Override
    public Integer goodsBuy(Integer goodsId, Integer count) {
        /*if (count <= 0) {
            throw new CommonException("", StatusCode.NO);
        }*/
        int updateCount = goodsMapper.updateCount(goodsId, count);
        if (updateCount <= 0) {
            throw new CommonException("", StatusCode.NO);
        }
        return updateCount;
    }
}
