package thamuswan.sample.springrdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import thamuswan.sample.springrdb.model.Citizen;
import thamuswan.sample.springrdb.repository.CitizenRepository;
import thamuswan.sample.springrdb.service.CitizenService;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    CitizenService citizenService;

    @Autowired
    CitizenRepository citizenRepository;

    @Override
    public void run(String... args) throws Exception {
    }

}
