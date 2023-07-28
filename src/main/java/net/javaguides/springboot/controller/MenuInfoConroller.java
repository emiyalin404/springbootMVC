package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.service.MenuInfoService;
import net.javaguides.springboot.to.MenuInfo;

@RestController
@RequestMapping("/VueTestApi/api/v1/menuinfo")
public class MenuInfoConroller {
    private MenuInfoService menuInfoService;

    public MenuInfoConroller(MenuInfoService menuInfoService) {
        this.menuInfoService = menuInfoService;
    }

    @PostMapping("/MenuInfo")
    public List<MenuInfo> MenuInfo(@RequestBody MenuInfo menuInfo) {
        String MENU_NAME = menuInfo.getMenuName();
        System.out.println(MENU_NAME);
        return menuInfoService.MenuInfo();
    }
}
