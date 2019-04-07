package com.fh.shop.area.model;

import java.util.List;

public class ProvinceResponse {

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
         * id : 2
         * pId : 1
         * areaName : 北京
         */

        private int id;
        private int pId;
        private String areaName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPId() {
            return pId;
        }

        public void setPId(int pId) {
            this.pId = pId;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }
    }
}
