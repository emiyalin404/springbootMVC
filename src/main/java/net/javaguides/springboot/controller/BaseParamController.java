package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.BaseParam;
import net.javaguides.springboot.service.BaseParamService;

@RestController
@RequestMapping("/api/VueTest")
public class BaseParamController {
    private BaseParamService baseParamService;

    public BaseParamController(BaseParamService baseParamService) {
        this.baseParamService = baseParamService;
    }

    @PostMapping("/VueTestApi/SelectOptions")
    @CrossOrigin("*")
    public List<BaseParam> allBaseParams(@RequestBody BaseParam baseParam) {
        return baseParamService.allselect();
    }

    @PostMapping("/QuerySelectOptions")
    @CrossOrigin("*")
    public List<BaseParam> SelectOption(@RequestBody String TITLE) {
        System.out.println(TITLE);
        System.out.println(baseParamService.SelectOption(TITLE));
        return baseParamService.SelectOption(TITLE);
    }
}
