package com.fh.shop.product.service;

import com.fh.shop.product.model.ProductResponse;
import com.fh.shop.util.HttpClient;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements IProductService {

    @Value("${product.list}")
    private String PRODUCTLIST;

    @Override
    public ProductResponse selectProductList() {

        String getResponse = HttpClient.getGetResponse(PRODUCTLIST);

        //String postResponse = HttpClient.getPostResponse(PRODUCTLIST);

        Gson gson = new Gson();

        ProductResponse getResponseValue = gson.fromJson(getResponse, ProductResponse.class);

        //ProductResponse postResponseValue = gson.fromJson(postResponse, ProductResponse.class);

        return getResponseValue;
    }


}
