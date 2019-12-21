package com.imooc.controller;

import com.imooc.dto.DemoVO;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity demo(DemoVO demoVO){
        System.out.println(ReflectionToStringBuilder.toString(demoVO));
        System.out.println(ReflectionToStringBuilder.toString(demoVO,ToStringStyle.SHORT_PREFIX_STYLE));
        System.out.println(ReflectionToStringBuilder.toString(demoVO,ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(ReflectionToStringBuilder.toString(demoVO,ToStringStyle.JSON_STYLE));

        return ResponseEntity.ok(ReflectionToStringBuilder.toString(demoVO));
    }
    @GetMapping("/demo/{id:\\d+}")
    public String demo01(@PathVariable("id") Long id){
        return "卧槽";
    }
}
