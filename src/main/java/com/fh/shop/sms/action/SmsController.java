package com.fh.shop.sms.action;

import com.fh.shop.sms.service.ISmsService;
import com.fh.shop.util.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sms")
public class SmsController {

    @Resource(name = "smsService")
    private ISmsService smsService;

    @RequestMapping("sendSms")
    public ServerResponse sendSms(String phoneNumber){

        ServerResponse serverResponse = smsService.sendSms(phoneNumber);

        return serverResponse;
    }

}
