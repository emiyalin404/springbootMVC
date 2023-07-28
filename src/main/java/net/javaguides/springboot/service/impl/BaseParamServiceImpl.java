package net.javaguides.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.BaseParam;
import net.javaguides.springboot.repository.BaseParamResponsitory;
import net.javaguides.springboot.service.BaseParamService;

@Service
public class BaseParamServiceImpl implements BaseParamService {
    private BaseParamResponsitory baseParamResponsitory;

    public BaseParamServiceImpl(BaseParamResponsitory baseParamResponsitory) {
        this.baseParamResponsitory = baseParamResponsitory;
    }

    @Override
    public List<BaseParam> allselect() {
        return baseParamResponsitory.allselect();
    }

    @Override
    public List<BaseParam> SelectOption(String TITLE) {
        return baseParamResponsitory.SelectOption(TITLE);
    }

}
