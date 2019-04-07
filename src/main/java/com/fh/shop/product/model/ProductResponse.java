package com.fh.shop.product.model;

import java.util.List;

public class ProductResponse {


    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 100
         * productName : 贺莉
         * productPrice : 68.16
         * imgPath : /image/fec24621-bf39-4a3e-b6d5-c44aa1779ef0.jpg
         */

        private int id;
        private String productName;
        private double productPrice;
        private String imgPath;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(double productPrice) {
            this.productPrice = productPrice;
        }

        public String getImgPath() {
            return imgPath;
        }

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }
    }
}
