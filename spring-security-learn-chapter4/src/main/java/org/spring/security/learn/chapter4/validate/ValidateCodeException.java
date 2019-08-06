/**
 * 
 */
package org.spring.security.learn.chapter4.validate;

import org.springframework.security.core.AuthenticationException;

/**
 * AuthenticationException 是 springframework.security提供的，登录过程中所有异常的基类
 *
 */
public class ValidateCodeException extends AuthenticationException {

	private static final long serialVersionUID = -7285211528095468156L;

	public ValidateCodeException(String msg) {
		super(msg);
	}

}
