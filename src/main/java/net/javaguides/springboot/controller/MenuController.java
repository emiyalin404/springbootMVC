package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.menu;
import net.javaguides.springboot.service.MenuService;

@RestController
@RequestMapping("/api/vi/menu")
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/Allmenu")
    public List<menu> Allmenu(@RequestBody menu menu) {
        System.out.println(menu);
        return menuService.Allmenu();
    }

    @PostMapping("/pmenu")
    public List<menu> pmenu(@RequestBody menu menu) {
        return menuService.pmenu();
    }
}
