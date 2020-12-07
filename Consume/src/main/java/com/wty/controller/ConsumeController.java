package com.wty.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
@RestController
public class ConsumeController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 输入username和rname两个值
     * */
    @GetMapping("/insertNews")
    public String insertNews(String username, String rname){
        System.out.println(username);
       // String username1 = this.restTemplate.postForObject("http://user/getUidByUsername?username={username}", username, String.class);
        //String rname1 = this.restTemplate.postForObject("http://roles/getRidByRname?rname={rname}", rname, String.class);


        String suid= this.restTemplate.getForObject("http://user/getUidByUsername?username={username}", String.class, username);
//        String s = JSONObject.toJSONString(suid);
        System.out.println(suid);
        Integer uid =  Integer.parseInt(suid);
        String srid = this.restTemplate.getForObject("http://roles/getRidByRname?rname={rname}", String.class, rname);
//        String s1 = JSONObject.toJSONString(srid);
        System.out.println(srid);
        Integer rid =  Integer.parseInt(srid);
       return restTemplate.getForObject("http://userandrole/insertUserRole?uid={uid}&rid={rid}",String.class,uid,rid);

    }

}
