package com.springbatchprocessing.batchprocessing;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.springbatchprocessing.batchprocessing")
@EntityScan("com.springbatchprocessing.batchprocessing")
@EnableJpaRepositories("com.springbatchprocessing.batchprocessing")
public class BatchProcessingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingApplication.class, args);
    }

}
