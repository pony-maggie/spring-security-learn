package org.spring.security.learn.chapter4.validate.sms;


public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {

        //TODO:真实的项目中，这里要接入短信发送平台
        System.out.println("向手机发送短信验证码"+mobile+"---"+code);

    }
}
