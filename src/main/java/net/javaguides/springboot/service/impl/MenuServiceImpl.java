package net.javaguides.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.menu;
import net.javaguides.springboot.repository.MenuResponsitory;
import net.javaguides.springboot.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
    private MenuResponsitory menuResponsitory;

    public MenuServiceImpl(MenuResponsitory menuResponsitory) {
        this.menuResponsitory = menuResponsitory;
    }

    @Override
    public List<menu> Allmenu() {
        return menuResponsitory.Allmenu();
    }

    @Override
    public List<menu> pmenu() {
        return menuResponsitory.pmenu();
    }

}
