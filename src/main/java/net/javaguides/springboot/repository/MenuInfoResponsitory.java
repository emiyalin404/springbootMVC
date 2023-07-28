package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.to.MenuInfo;

public interface MenuInfoResponsitory extends JpaRepository<MenuInfo, Long> {
    // @Query("SELECT a.menuId AS MENU_ID, a.menuName AS MENU_NAME, " +
    // "a.pMenuId AS P_MENU_ID, a.seqNo AS SEQ_NO, " +
    // "a.page AS PAGE, a.icon AS ICON, " +
    // "a.path AS PATH, NULL AS children, " +
    // "b.menuId AS MENU_ID_B, " +
    // "b.menuName AS MENU_NAME_B, " +
    // "b.pMenuId AS P_MENU_ID_B, " +
    // "b.seqNo AS SEQ_NO_B, " +
    // "b.page AS PAGE_B, " +
    // "b.path AS PATH_B, " +
    // "NULL AS children_B, " +
    // "CONCAT(b.pMenuId, '@', a.icon, '@@', b.menuId, '@', b.icon, '@', b.path) AS
    // BREADCRUMB_B " +
    // "FROM Menu a LEFT JOIN Menu b ON a.menuId = b.pMenuId " +
    // "WHERE a.pMenuId IS NULL AND b.pMenuId IS NOT NULL")
    @Query(" SELECT a FROM MenuInfo a")
    List<MenuInfo> MenuInfo();
}
