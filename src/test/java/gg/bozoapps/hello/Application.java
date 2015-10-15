package gg.bozoapps.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	
    	/*
    	System.setProperty("https.proxyHost", "igala-horto-br-habc2.br.ibm.com");
		System.setProperty("https.proxyPort", "8080");
		*/
        SpringApplication.run(Application.class, args);
    }
}