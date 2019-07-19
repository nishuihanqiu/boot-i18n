package com.lls.i18n;

import com.lls.i18n.model.I18nDO;

/************************************
 * I18nDTO
 * @author liliangshan
 * @date 2019-07-19
 ************************************/
public class I18nDTO {

  private String name;
  private String description;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }


  public I18nDO toDO() {
    return new I18nDO(null, name, description);
  }
}
