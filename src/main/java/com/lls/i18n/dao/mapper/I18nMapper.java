package com.lls.i18n.dao.mapper;

import com.lls.i18n.model.I18nDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/************************************
 * I18nMapper
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
@Repository
@Mapper
public interface I18nMapper {

    long save(I18nDO i18nDO);

    List<I18nDO> listAll(Map<String, Object> map);

    long count(Map<String, Object> map);

    I18nDO getItem(long id);

}
