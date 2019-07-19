package com.lls.i18n.dao.provider;

import com.lls.i18n.model.I18nDO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/************************************
 * I18nProvider
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
public class I18nProvider {

    private static final String TABLE_NAME = "i18n";
    private static final String id = "id";
    private static final String name = "name";
    private static final String description = "description";
    private static final String createdAt = "created_at";
    private static final String updatedAt = "updated_at";

    public String listAll(Map<String, Object> params) {
        return new SQL() {
            {
                SELECT(id, name, description, createdAt, updatedAt);
                FROM(TABLE_NAME);
                if (params.get("name") != null) {
                    WHERE(name + " LIKE CONCAT('%',#{name}, '%')");
                }
                if (params.get("page") != null && params.get("size") != null) {
                    ORDER_BY(createdAt + " LIMIT #{page},#{size}");
                } else if (params.get("size") != null) {
                    ORDER_BY(createdAt + " LIMIT #{size}");
                }
            }
        }.toString();
    }

    public String count(Map<String, Object> params) {
        return new SQL() {
            {
                SELECT("COUNT(*)");
                FROM(TABLE_NAME);
                if (params.get("name") != null) {
                    WHERE(name + " LIKE CONCAT('%',#{name}, '%')");
                }
            }
        }.toString();
    }

    public String save(I18nDO i18nDO) {
        return new SQL() {
            {
                INSERT_INTO(TABLE_NAME);
                VALUES(name, "#{name}");
                VALUES(description, "#{description}");
            }
        }.toString();
    }

    public String getItem() {
        return new SQL() {
            {
                SELECT(id, name, description, createdAt, updatedAt);
                FROM(TABLE_NAME);
                WHERE(id + " = #{id}");
            }
        }.toString();
    }

}
