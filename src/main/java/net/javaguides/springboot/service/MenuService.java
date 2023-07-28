package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.entity.menu;

public interface MenuService {
    List<menu> Allmenu();

    List<menu> pmenu();
}
