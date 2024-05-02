package api.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    public static void mainApp(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static void main(String[] args) {
        System.out.print("\033\143");

        System.out.println(Math.abs(-4.7));
    }

}
