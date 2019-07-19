package com.lls.i18n.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/************************************
 * BaseService
 * @author liliangshan
 * @date 2019-07-19
 ************************************/
public abstract class BaseService {

  private final Logger logger = LoggerFactory.getLogger(BaseService.class);

  @Autowired
  private MessageSource messageSource;
  @Autowired
  private HttpServletRequest httpServletRequest;

  protected String getMessage(String key, String defaultMessage) {
    return this.getMessage(key, null, defaultMessage, "cn");
  }

  private String getMessage(String key, Object[] args, String defaultMessage, String locale) {
    return messageSource.getMessage(key, args, defaultMessage, new Locale(locale));
  }

  protected String getMessage(String key) {
    String localName = httpServletRequest.getHeader("X-LOCAL");
    if (localName == null) {
      localName = "CN";
    }
    return this.getMessage(key, null, "", localName.toLowerCase());
  }

  protected String getMessage(String key, Object[] args, String defaultMessage) {
    String localName = httpServletRequest.getHeader("X-LOCAL");
    if (localName == null) {
      localName = "";
    }
    logger.info("current local:{}, defaultMessage:{}", localName, defaultMessage);
    return this.getMessage(key, args, defaultMessage, localName.toLowerCase());
  }

  /* *
   * 1. barren 加配置
   * 2. 定义配置规范：header和path
   * 3. retrofit  加header
   * 4. 异常日志记录 cat logger
   * 5. get message 最佳获取方式
   * 6. 统计修改数量
   * 7. x_lang : cn en 定义
   *
   */
}
