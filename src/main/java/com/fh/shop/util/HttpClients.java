package com.fh.shop.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HttpClients {

    public static String httpPostClient(String url, Map<String, String> header, Map<String, String> params) {

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost(url);

        if(null != header && header.size() > 0){

            Iterator<Map.Entry<String, String>> iterator = header.entrySet().iterator();

            while (iterator.hasNext()){

                Map.Entry<String, String> next = iterator.next();

                String key = next.getKey();

                String value = next.getValue();

                httpPost.addHeader(key,value);
            }
        }

        if(null != params && params.size() > 0){

            List<NameValuePair> list = new ArrayList<>();

            Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();

            while (iterator.hasNext()){

                Map.Entry<String, String> next = iterator.next();

                String key = next.getKey();

                String value = next.getValue();

                list.add(new BasicNameValuePair(key,value));
            }

            try {
                UrlEncodedFormEntity paramsInfo = new UrlEncodedFormEntity(list, "utf-8");

                httpPost.setEntity(paramsInfo);

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        CloseableHttpResponse execute = null;

        String result = null;

        try {
            execute = client.execute(httpPost);

            HttpEntity entity = execute.getEntity();

            result = EntityUtils.toString(entity, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(null != execute){
                try {
                    execute.close();
                    execute = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != httpPost){
                httpPost.releaseConnection();
                httpPost = null;
            }

            if(null != client){
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
