package com.github.yukihane.spring.mybatis.dao;

import com.github.yukihane.spring.mybatis.domain.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(final SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(final long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }
}
