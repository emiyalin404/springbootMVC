package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.entity.menu;

public interface MenuResponsitory extends JpaRepository<menu, Long> {
    @Query("SELECT m FROM menu m" +
            " WHERE m.P_MENU_ID = null")
    List<menu> Allmenu();

    @Query("SELECT m FROM menu m")
    List<menu> pmenu();
}
