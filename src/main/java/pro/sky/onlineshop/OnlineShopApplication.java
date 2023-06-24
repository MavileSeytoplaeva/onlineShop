package pro.sky.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {

    public static void main(String[] args) {
        System.setProperty("server.servlry.context-path", "/store");

        SpringApplication.run(OnlineShopApplication.class, args);
    }

}
