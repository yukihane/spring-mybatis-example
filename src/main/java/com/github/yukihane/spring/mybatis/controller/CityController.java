package com.github.yukihane.spring.mybatis.controller;

import com.github.yukihane.spring.mybatis.domain.City;
import com.github.yukihane.spring.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/city")
public class CityController {

    @Autowired
    private CityMapper mapper;

    @GetMapping(path = "/{state}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public City city(@PathVariable final String state) {
        return mapper.findByState(state);
    }
}
