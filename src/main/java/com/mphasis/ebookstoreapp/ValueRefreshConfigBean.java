package com.mphasis.ebookstoreapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ValueRefreshConfigBean {
	
	private String  color;

	public ValueRefreshConfigBean(
			
			@Value("${application.theme.color}")  String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	
	
	

}
