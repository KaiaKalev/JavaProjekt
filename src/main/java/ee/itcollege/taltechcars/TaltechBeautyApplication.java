package ee.itcollege.taltechcars;

import ee.itcollege.taltechcars.model.BeautyService;
import ee.itcollege.taltechcars.model.User;
import ee.itcollege.taltechcars.repository.BeautyRepository;
import ee.itcollege.taltechcars.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaltechBeautyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaltechBeautyApplication.class, args);
    }

    @Bean
    public CommandLineRunner initCars(BeautyRepository repository) {
        return (args) -> {
            // save a couple of cars
            repository.save(new BeautyService("Fake Nails",30, "Fake nails with nice print",30));
            repository.save(new BeautyService("Fake eyelashes",70, "Fake eyelashes with desired length",40));
            repository.save(new BeautyService("Face deep cleaning",20, "Face cleaning with natural herbs",20));
            repository.save(new BeautyService("Haircut",30, "Haircut and washing",30));
            repository.save(new BeautyService("Eyebrow correction",30, "Nice eyebrows for you",10));
        };
    }

    @Bean
    public CommandLineRunner initUsers(UserRepository repository) {
        return (args) -> {
            // save a couple of students
            repository.save(new User("KaiaKalev", "56279690"));
            repository.save(new User("KadiKask", "56279800"));
            repository.save(new User("KimPaala", "47859020"));
            repository.save(new User("DavidKana", "12358876"));
            repository.save(new User("MartinKass", "78995562"));
        };
    }
}
