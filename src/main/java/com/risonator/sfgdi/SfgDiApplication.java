package com.risonator.sfgdi;

import com.risonator.sfgdi.controllers.ConstructorInjectedController;
import com.risonator.sfgdi.controllers.I18nController;
import com.risonator.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		I18nController c = (I18nController) ctx.getBean("i18nController");
		System.out.println(c.sayInternationalGreeting());
	}

}
