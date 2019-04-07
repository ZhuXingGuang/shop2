package com.fh.shop.util;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class SendSms{

    @Value("${app.key}")
    public String appkey;

    @Value("${app.secret}")
    public String appSecret;

    public String sendSms(String phoneNumber){

        Map<String, String> header = new HashMap<String, String>();

        header.put("AppKey","a72dd97b8042adbf2b1187532aa0b94b");

        String nonce = UUID.randomUUID().toString();
        header.put("Nonce",nonce);

        String cuTime = "" + new Date().getTime();
        header.put("CurTime", cuTime);

        String checkSum = CheckSumBuilder.getCheckSum("48859e7ddde0", nonce, cuTime);
        header.put("CheckSum",checkSum);

        Map<String, String> params = new HashMap<String, String>();

        params.put("mobile",phoneNumber);

        params.put("codeLen", "6");

        String result = HttpClients.httpPostClient("https://api.netease.im/sms/sendcode.action", header, params);

        return result;
    }
}
