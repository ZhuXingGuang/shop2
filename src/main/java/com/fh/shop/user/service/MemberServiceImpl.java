package com.fh.shop.user.service;

import com.fh.shop.util.HttpClients;
import com.fh.shop.util.ServerResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberService")
public class MemberServiceImpl implements IMemberService {

    @Value("${member.add}")
    private String memberAdd;

    @Override
    public ServerResponse addMember(Map map) {

        String resule = HttpClients.httpPostClient(memberAdd, null, map);

        System.out.println(resule);

        Gson gson = new Gson();

        ServerResponse serverResponse = gson.fromJson(resule,ServerResponse.class);

        return serverResponse;
    }
}
