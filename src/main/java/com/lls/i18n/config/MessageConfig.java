package com.lls.i18n.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Properties;

/************************************
 * MessageConfig
 * @author liliangshan
 * @date 2019-07-19
 ************************************/
@Configuration
public class MessageConfig {

  //【注意】这个bean的名字必须叫messageSource，否则无效
  @Bean
  public MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
    messageSource.setCacheSeconds(-1); // 默认是-1，生产环境一般都是这个, 量大可以设置时间
//    Properties properties = new Properties();
//    properties.setProperty("classpath:/i18n/message_cn", "GBK");
//    messageSource.setFileEncodings(properties);
    messageSource.setBasename("classpath:/i18n/message");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }

//  @Bean
//  public LocalValidatorFactoryBean validator(MessageSource messageSource) {
//    LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//    bean.setValidationMessageSource(messageSource);
//    return bean;
//  }

//  @Bean
//  public MessageSource messageSource() {
//    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//    messageSource.setBasename("i18n/message");
//    messageSource.setDefaultEncoding("UTF-8");
//    return messageSource;
//  }

}
