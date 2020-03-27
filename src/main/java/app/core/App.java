package app.core;

import app.core.model.EmailExtractionsStatus;
import app.core.repo.EmailStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private EmailStatusRepo emailStatusRepo;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {

        emailStatusRepo.insert(new EmailExtractionsStatus(1,"server1", LocalDateTime.now()));
        EmailExtractionsStatus status=emailStatusRepo.checkStatus("server1");
       System.out.println(status.getEmailLocalDateTime());
    }
}
