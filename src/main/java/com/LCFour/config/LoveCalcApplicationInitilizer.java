package com.LCFour.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalcApplicationInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("LCFour");
		
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LCAppConfig.class);
		
		DispatcherServlet dispatcheServlet=new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myCoustomDispatcherServlet= servletContext.addServlet("myDispatcherServlet", dispatcheServlet);
		myCoustomDispatcherServlet.setLoadOnStartup(1);
		myCoustomDispatcherServlet.addMapping("/");
	}

}
