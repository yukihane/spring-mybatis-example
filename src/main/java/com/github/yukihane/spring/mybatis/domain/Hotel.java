package com.github.yukihane.spring.mybatis.domain;

import lombok.Data;

@Data
public class Hotel {
    private Long city;

    private String name;

    private String address;

    private String zip;
}
