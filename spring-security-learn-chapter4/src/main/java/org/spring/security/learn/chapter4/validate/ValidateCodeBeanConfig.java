package org.spring.security.learn.chapter4.validate;


import org.spring.security.learn.chapter4.validate.sms.DefaultSmsCodeSender;
import org.spring.security.learn.chapter4.validate.sms.SmsCodeSender;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 验证码相关的扩展点配置。配置在这里的bean，业务系统都可以通过声明同类型或同名的bean来覆盖安全
 */
@Configuration
public class ValidateCodeBeanConfig {

    /**
     * 短信验证码发送器
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class)
    public SmsCodeSender smsCodeSender() {
        return new DefaultSmsCodeSender();
    }

    //TODO:如果有图片验证码可以继续定义
}
