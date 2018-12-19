package com.wdnsszm.springboot_pro.druid.dao;

import com.wdnsszm.springboot_pro.druid.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CityMapper {
    List<City> findCityList();
}
