package com.jeff.gamekiller.controller.show;

import com.google.common.collect.Lists;
import com.jeff.gamekiller.dto.GameItemDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/game/show")
public class GameInfoController {

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<GameItemDTO> listForGame(
            @RequestParam(name = "page", defaultValue = "1") Integer page,
            @RequestParam(name = "size", defaultValue = "10") Integer size,
            @RequestParam(name = "gameName", required = false) String gameName,
            @RequestParam(name = "categories", required = false) List<String> categories
    ) {
        return Lists.newArrayList();
    }

}
