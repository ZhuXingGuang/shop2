package com.fh.shop.area.service;

import com.fh.shop.area.model.CityResponse;
import com.fh.shop.area.model.CountyResponse;
import com.fh.shop.area.model.ProvinceResponse;
import com.fh.shop.util.HttpClient;
import com.fh.shop.util.HttpClients;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("areaService")
public class AreaServiceImpl implements IAreaService {

    @Value("${province.list}")
    private String province;

    @Value("${city.list}")
    private String city;

    @Value("${county.list}")
    private String county;

    @Override
    public ProvinceResponse selectProvince() {

        String result = HttpClient.getPostResponse(province);

        Gson gson = new Gson();

        ProvinceResponse provinceResponse = gson.fromJson(result, ProvinceResponse.class);

        return provinceResponse;
    }

    @Override
    public CityResponse selectCity(String id) {

        Map<String, String> params = new HashMap<String, String>();

        params.put("id",id);

        String result = HttpClients.httpPostClient(city, null, params);

        Gson gson = new Gson();

        CityResponse cityResponse = gson.fromJson(result, CityResponse.class);

        return cityResponse;
    }

    @Override
    public CountyResponse SelectCounty(String id) {

        Map<String, String> params = new HashMap<String, String>();

        params.put("id",id);

        String result = HttpClients.httpPostClient(county, null, params);

        Gson gson = new Gson();

        CountyResponse countyResponse = gson.fromJson(result, CountyResponse.class);

        return countyResponse;
    }

}
