/**
 * 
 */
package org.spring.security.learn.chapter4.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.security") //读取以my.security开头的配置项
public class SecurityProperties {

	//短信验证码配置
	private ValidateCodeProperties code = new ValidateCodeProperties();
	public ValidateCodeProperties getCode() {
		return code;
	}

}