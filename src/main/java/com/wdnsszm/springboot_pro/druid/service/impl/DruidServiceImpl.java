package com.wdnsszm.springboot_pro.druid.service.impl;

import com.wdnsszm.springboot_pro.druid.dao.CityMapper;
import com.wdnsszm.springboot_pro.druid.entity.City;
import com.wdnsszm.springboot_pro.druid.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DruidServiceImpl implements DruidService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> findCityList() {
        return cityMapper.findCityList();
    }
}
