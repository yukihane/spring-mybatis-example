package com.github.yukihane.spring.mybatis.mapper;

import com.github.yukihane.spring.mybatis.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int cityId);

}