package com.fh.shop.area.service;

import com.fh.shop.area.model.CityResponse;
import com.fh.shop.area.model.CountyResponse;
import com.fh.shop.area.model.ProvinceResponse;

public interface IAreaService {

    ProvinceResponse selectProvince();

    CityResponse selectCity(String id);

    CountyResponse SelectCounty(String id);
}
