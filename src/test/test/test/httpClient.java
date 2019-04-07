package test;

import com.fh.shop.util.SendSms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-common.xml"})
public class httpClient extends AbstractJUnit4SpringContextTests {

    @Resource(name = "sendSms")
    private SendSms sendSms;

    @Test
    public void sms() {

        String result = sendSms.sendSms("18738823014");

        System.out.println(result);
    }


}
