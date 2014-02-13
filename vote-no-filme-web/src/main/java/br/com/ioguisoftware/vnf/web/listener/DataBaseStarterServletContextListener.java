package br.com.ioguisoftware.vnf.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import br.com.ioguisoftware.vnf.model.service.FilmeService;

@WebListener
public class DataBaseStarterServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// do nothing here
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//Generating the 5 films here 'cause the database is in-memory
		WebApplicationContext springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
		FilmeService filmeService = springContext.getBean("filmeService", FilmeService.class);
		filmeService.generateFilmes();
	}

}
