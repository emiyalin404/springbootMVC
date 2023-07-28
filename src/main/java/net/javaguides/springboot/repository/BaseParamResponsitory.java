package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import net.javaguides.springboot.entity.BaseParam;

public interface BaseParamResponsitory extends JpaRepository<BaseParam, Long> {
    @Query("SELECT b FROM BaseParam b")
    List<BaseParam> allselect();

    @Query("SELECT b FROM BaseParam b" +
            " WHERE b.TITLE = :TITLE")
    List<BaseParam> SelectOption(String TITLE);
}
