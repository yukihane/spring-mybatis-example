package com.github.yukihane.spring.mybatis;

import com.github.yukihane.spring.mybatis.dao.CityDao;
import com.github.yukihane.spring.mybatis.mapper.HotelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMybatisExampleApplication implements CommandLineRunner {

    private final CityDao cityDao;

    private final HotelMapper hotelMapper;

    public SpringMybatisExampleApplication(final CityDao cityDao, final HotelMapper hotelMapper) {
        this.cityDao = cityDao;
        this.hotelMapper = hotelMapper;
    }

    public static void main(final String[] args) {
        SpringApplication.run(SpringMybatisExampleApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println(this.cityDao.selectCityById(1));
        System.out.println(this.hotelMapper.selectByCityId(1));
    }

}
