package com.vgc.itp.miniprogramdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner demo(SurveyRepository repository){
	// 	return (args)->{
	// 		repository.save(new Survey("DKA7AB7","1234","5678","Male"));
	// 		repository.save(new Survey("DKA7AB8","1234","5678","Female"));
	// 		log.info("Survey Find Survey");
	// 		for(Survey survey: repository.findAll()){
	// 			log.info(survey.getStaffnum()+"-"+survey.getGender()+"-"+survey.getMobilenum());
	// 		}
	// 		log.info("Find Survey by uid");
	// 		log.info(repository.findByuid("DKA7AB7").getStaffnum());
	// 	};
	// }

}
