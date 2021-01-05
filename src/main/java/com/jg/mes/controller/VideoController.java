package com.jg.mes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jg.yu
 * @Date: 2020/12/31 - 12 - 31 - 15:59
 * @Description: com.jg.mes.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @RequestMapping("list")
    public Object list(){
        Map<Object, Object> map = new HashMap<>();
        map.put(1,"Hello World!");
        return map;
    }
    @GetMapping("list1")
    public  Object list1(){
        return  "Hello World!";
    }
}
