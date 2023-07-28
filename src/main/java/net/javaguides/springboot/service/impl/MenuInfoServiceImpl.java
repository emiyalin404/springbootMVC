package net.javaguides.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.repository.MenuInfoResponsitory;
import net.javaguides.springboot.service.MenuInfoService;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    private MenuInfoResponsitory menuInfoResponsitory;

    public MenuInfoServiceImpl(MenuInfoResponsitory menuInfoResponsitory) {
        this.menuInfoResponsitory = menuInfoResponsitory;
    }

    @Override
    public List<net.javaguides.springboot.to.MenuInfo> MenuInfo() {
        System.out.println("132312");
        return menuInfoResponsitory.MenuInfo();
    }

}
