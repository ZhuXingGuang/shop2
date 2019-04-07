package com.fh.shop.sms.service;

import com.fh.shop.util.ServerResponse;

public interface ISmsService {

    ServerResponse sendSms(String phoneNumber);
}
