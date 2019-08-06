/**
 * 
 */
package org.spring.security.learn.chapter4.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(SecurityProperties.class)//使SecurityProperties中的配置生效
public class SecurityCoreConfig {

}
