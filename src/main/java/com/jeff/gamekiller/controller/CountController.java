package com.jeff.gamekiller.controller;

import com.jeff.gamekiller.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/gamekyller/goods")
public class CountController {

    @Resource
    private GoodsService goodsService;

    @GetMapping(value = "/count/{goodsId}")
    public ResponseEntity<Integer> countGoodsGet(@PathVariable(name = "goodsId") Integer goodsId) {
        Integer goodsCount = goodsService.goodsCount(goodsId);
        return ResponseEntity.ok(goodsCount);
    }

    @GetMapping(value = "/buy/{goodsId}")
    public ResponseEntity<Integer> buyGoods(@PathVariable(name = "goodsId") Integer goodsId, @RequestParam(name = "count") Integer count) {
        Integer integer = goodsService.goodsBuy(goodsId, count);
        return ResponseEntity.ok(integer);
    }
}
