package me.snajdovski.crossfit;

import me.snajdovski.crossfit.data.ICrossfitUsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(ICrossfitUsersRepository repository) {
        return args -> {
            //nekolku korisnici za testiranje pri inicijalizacija
             //User stefan = new User( "Stefan", true, date, time.toLocalTime(), time1.toLocalTime(), "", AttendanceStatus.GOING);
            //User nekoj =  new User( "nekoj", true, date, time.toLocalTime(), time1.toLocalTime(), "", AttendanceStatus.MAYBE);
            //repository.saveAll(List.of(stefan, nekoj));
        };
    }
}