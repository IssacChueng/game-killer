package com.jeff.gamekiller.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swzhang
 * @date 2019/3/22
 * @description
 */
@RestController
public class IndexController {

    @GetMapping(value = "/index", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Integer> index() {
        return ResponseEntity.ok(0);
    }
}
