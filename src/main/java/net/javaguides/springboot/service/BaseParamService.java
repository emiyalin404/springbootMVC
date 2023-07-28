package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.entity.BaseParam;

public interface BaseParamService {
    List<BaseParam> allselect();

    List<BaseParam> SelectOption(String TITLE);
}
