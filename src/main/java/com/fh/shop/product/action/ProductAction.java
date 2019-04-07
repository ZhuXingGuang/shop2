package com.fh.shop.product.action;

import com.fh.shop.product.model.ProductResponse;
import com.fh.shop.product.service.IProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductAction {

    @Resource(name = "productService")
    private IProductService productService;


    @RequestMapping("selectProductList")
    public ProductResponse selectProductList(){

        ProductResponse productResponse = productService.selectProductList();

        return productResponse;
    }



}
