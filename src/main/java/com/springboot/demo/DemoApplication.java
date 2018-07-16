package com.springboot.demo;



import com.springboot.demo.dao.JournalRepository;
import com.springboot.demo.entity.Journal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Bean
    InitializingBean saveData(JournalRepository journalRepository){
        return ()->{

            journalRepository.save(new Journal("Get to know Spring Boot","Today I will learn Spring Boot","01/01/2016"));
            journalRepository.save(new Journal("Simple Spring Boot Project","I will do my first Spring Boot Project","01/02/2016"));
            journalRepository.save(new Journal("Spring Boot Reading","Read more about Spring Boot","02/01/2016"));
            journalRepository.save(new Journal("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","03/01/2016"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
