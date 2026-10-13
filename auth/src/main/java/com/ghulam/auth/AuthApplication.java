package com.ghulam.auth;

import com.ghulam.auth.helper.AppSetting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import static com.ghulam.auth.helper.AppSetting.LOGGER;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        LOGGER(String.format("Swagger docs is up at: %s", AppSetting.DOCS_URL));
    }
}
