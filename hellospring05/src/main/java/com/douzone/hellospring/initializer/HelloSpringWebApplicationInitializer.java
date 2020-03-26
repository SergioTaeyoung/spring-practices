package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HelloSpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Root Application context 설정 클래스
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Web Application context 설정 클래스
		return new Class<?>[] {WebConfig.class};
		
	}

	@Override
	protected String[] getServletMappings() {
		// 서블릿 매핑
		return new String[] {"/"};
	}

}
