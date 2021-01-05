package com.jg.mes.controller;

import com.jg.mes.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 7:30
 * @Description: com.jg.mes.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping("users")
    public Object users(){
        return new User(1,"admin","123456",new Date());
    }
}
