package org.lazy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangying
 * @version 1.0
 * @project origin_project
 * @description
 * @date 2023/5/24 17:15:42
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/pay")
    public String pay() {
        System.out.println("调用失败");
        return "error";
    }
}
