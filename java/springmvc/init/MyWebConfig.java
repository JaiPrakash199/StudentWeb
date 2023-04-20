package springmvc.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages= {"springmvc"})
public class MyWebConfig {

	@Bean
	public InternalResourceViewResolver getVR()
	{
		InternalResourceViewResolver ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/jspPages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
}
