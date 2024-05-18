package org.launchcode.firstawsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//installed maven 3.9.6 for making this project available to aws
//next step is creating the user to get the aws environment to be built. see pages for details.

@SpringBootApplication
public class FirstAwsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAwsProjectApplication.class, args);
	}

}
