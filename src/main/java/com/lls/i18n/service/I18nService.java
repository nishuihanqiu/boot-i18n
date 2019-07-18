package com.lls.i18n.service;

import com.lls.i18n.config.Result;
import com.lls.i18n.model.I18nDO;

import java.util.List;
import java.util.Map;

/************************************
 * I18nService
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
public interface I18nService {

    Long save(I18nDO i18nDO);

    List<I18nDO> listAll(Map<String, Object> map);

    long getTotal(Map<String, Object> map);

    I18nDO getItem(long id);

}
