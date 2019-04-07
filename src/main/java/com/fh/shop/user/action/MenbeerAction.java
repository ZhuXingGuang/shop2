package com.fh.shop.user.action;

import com.fh.shop.user.service.IMemberService;
import com.fh.shop.util.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class MenbeerAction {

    @Resource(name = "memberService")
    private IMemberService memberService;

    @RequestMapping("addMember")
    public ServerResponse addMember(@RequestParam Map map){

        ServerResponse serverResponse = memberService.addMember(map);

        return serverResponse;
    }

}
