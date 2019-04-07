package com.fh.shop.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClient {

    public static String getGetResponse(String url) {

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse execute = null;

        HttpEntity entity = null;

        String result = "";

        try {

            execute = client.execute(httpGet);

            entity = execute.getEntity();

            result = EntityUtils.toString(entity, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关流
            if(null!=execute){
                try {
                    execute.close();
                    execute = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(httpGet!=null){
                httpGet.releaseConnection();
                httpGet = null;
            }
            if(client!=null){
                try {
                    client.close();
                    client = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public static String getPostResponse(String url) {

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost(url);

        CloseableHttpResponse execute = null;

        HttpEntity entity = null;

        String result = null;

        try {

            execute = client.execute(httpPost);

            entity = execute.getEntity();

            result = EntityUtils.toString(entity, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关流
            if(null!=execute){
                try {
                    execute.close();
                    execute = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(httpPost!=null){
                httpPost.releaseConnection();
                httpPost = null;
            }
            if(client!=null){
                try {
                    client.close();
                    client = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
