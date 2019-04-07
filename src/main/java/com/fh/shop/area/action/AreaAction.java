package com.fh.shop.area.action;

import com.fh.shop.area.model.CityResponse;
import com.fh.shop.area.model.CountyResponse;
import com.fh.shop.area.model.ProvinceResponse;
import com.fh.shop.area.service.IAreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/area")
public class AreaAction {

    @Resource(name = "areaService")
    private IAreaService areaService;

    @RequestMapping("selectProvince")
    private ProvinceResponse selectProvince(){

        ProvinceResponse provinceResponse = areaService.selectProvince();

        return provinceResponse;
    }

    @RequestMapping("selectCity")
    private CityResponse selectCity(String id){

        CityResponse cityResponse = areaService.selectCity(id);

        return cityResponse;
    }

    @RequestMapping("SelectCounty")
    private CountyResponse SelectCounty(String id){

        CountyResponse countyResponse = areaService.SelectCounty(id);

        return countyResponse;
    }
}
