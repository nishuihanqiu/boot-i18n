package com.lls.i18n.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/************************************
 * MessageConfig
 * @author liliangshan
 * @date 2019-07-19
 ************************************/
@Configuration
public class MessageConfig {

  @Bean
  public MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
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

}
