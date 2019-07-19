package com.lls.i18n.dao.mapper;

import com.lls.i18n.dao.provider.I18nProvider;
import com.lls.i18n.model.I18nDO;
import org.apache.ibatis.annotations.*;
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

    @InsertProvider(method = "save", type = I18nProvider.class)
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    long save(I18nDO i18nDO);

    @SelectProvider(method = "listAll", type = I18nProvider.class)
    List<I18nDO> listAll(Map<String, Object> map);

    @SelectProvider(method = "count", type = I18nProvider.class)
    long count(Map<String, Object> map);

    @SelectProvider(method = "getItem", type = I18nProvider.class)
    I18nDO getItem(@Param("id") long id);


}
