package com.example.demo.Database;

import com.example.demo.Models.Product;
import com.example.demo.Repositories.ProducRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class Database {
    //logger giong lenh in ra man hinh, nhung dung trong Repositoire System.out.println = logger.info
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProducRepository producRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product product1 = new Product("MacBook",2023,2500.0,"");
                Product product2 = new Product("Asus",2022,2100.50,"");
                logger.info("insert data: "+producRepository.save(product1));
                logger.info("insert data: "+producRepository.save(product2));

            }
        };
    }

}
