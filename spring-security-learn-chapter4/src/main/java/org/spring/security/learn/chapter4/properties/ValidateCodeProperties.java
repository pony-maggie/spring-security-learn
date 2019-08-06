/**
 * 
 */
package org.spring.security.learn.chapter4.properties;


public class ValidateCodeProperties {

	private SmsCodeProperties sms = new SmsCodeProperties();

	public SmsCodeProperties getSms() {
		return sms;
	}

	public void setSms(SmsCodeProperties sms) {
		this.sms = sms;
	}
}
