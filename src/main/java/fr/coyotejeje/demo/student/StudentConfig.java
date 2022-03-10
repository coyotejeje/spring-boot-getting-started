package fr.coyotejeje.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maria.jones@yahoo.fr",
                    LocalDate.of(2000, FEBRUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@yahoo.fr",
                    LocalDate.of(2004, FEBRUARY, 5)
            );

            studentRepository.saveAll(
                    List.of(maria, alex)
            );
        };
    }
}
