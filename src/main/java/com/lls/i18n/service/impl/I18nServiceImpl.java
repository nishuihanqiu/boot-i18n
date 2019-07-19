package com.lls.i18n.service.impl;

import com.lls.i18n.config.MessageContantants;
import com.lls.i18n.dao.mapper.I18nMapper;
import com.lls.i18n.exception.NotFoundException;
import com.lls.i18n.model.I18nDO;
import com.lls.i18n.service.BaseService;
import com.lls.i18n.service.I18nService;
import com.lls.i18n.util.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/************************************
 * I18nServiceImpl
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
@Service
public class I18nServiceImpl extends BaseService implements I18nService {

    private final I18nMapper i18nMapper;

    @Autowired
    public I18nServiceImpl(I18nMapper i18nMapper) {
        this.i18nMapper = i18nMapper;
    }

    @Override
    public Long save(I18nDO i18nDO) {
        String message = this.getMessage(MessageContantants.ERROR_MESSAGE_ILLEGAL_ARGUMENT_NAME);
        ExceptionUtils.checkArgmentNull(i18nDO.getName(), message);
        return i18nMapper.save(i18nDO);
    }

    @Override
    public List<I18nDO> listAll(Map<String, Object> map) {
        return i18nMapper.listAll(map);
    }

    @Override
    public long getTotal(Map<String, Object> map) {
        return i18nMapper.count(map);
    }

    @Override
    public I18nDO getItem(long id) {
        I18nDO i18nDO = i18nMapper.getItem(id);
        String message = this.getMessage(MessageContantants.ERROR_MESSAGE_NOT_FOUND);
        ExceptionUtils.checkNull(i18nDO, message);
        return i18nDO;
    }

}
