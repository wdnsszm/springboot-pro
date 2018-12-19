package com.wdnsszm.springboot_pro.druid.controller;

import com.wdnsszm.springboot_pro.druid.entity.City;
import com.wdnsszm.springboot_pro.druid.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class DruidController {

    @Autowired
    DruidService druidService;

    @RequestMapping("/druid")
    public List<City> findCityList(String param){
        return druidService.findCityList();
    }


}
