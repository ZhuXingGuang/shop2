package com.fh.shop.sms.service;

import com.fh.shop.util.HttpClients;
import com.fh.shop.util.ServerResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("smsService")
public class SmsServiceImpl implements ISmsService {

        @Value("${member.sms}")
        private String sendSmsUrl;

    @Override
    public ServerResponse sendSms(String phoneNumber) {

        Map<String, String> params = new HashMap<String, String>();

        params.put("phoneNumber",phoneNumber);

        String result = HttpClients.httpPostClient(sendSmsUrl, null, params);

        Gson gson = new Gson();

        ServerResponse serverResponse = gson.fromJson(result, ServerResponse.class);

        return serverResponse;
    }
}
