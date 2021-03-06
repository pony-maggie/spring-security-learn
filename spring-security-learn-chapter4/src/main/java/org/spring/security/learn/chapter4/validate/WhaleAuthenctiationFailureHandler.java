/**
 * 
 */
package org.spring.security.learn.chapter4.validate;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component("whaleAuthenctiationFailureHandler")
public class WhaleAuthenctiationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException authenticationException ) throws IOException, ServletException {
		logger.error("登录失败");
		//TODO:其它处理，比如返回给前端json信息

	}

}
