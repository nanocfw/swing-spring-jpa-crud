package br.com.yaw.ssjpac.app;


import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ponto de entrada da aplicação.
 * 
 * @author YaW Tecnologia
 */
public class Main {
	
	public static void main(String[] args) {
            
            String teste = "asklnasdjkl";
		Locale.setDefault(new Locale("pt","BR"));
		new ClassPathXmlApplicationContext("META-INF/spring-config.xml");
            System.out.println(teste);    
	}

}
