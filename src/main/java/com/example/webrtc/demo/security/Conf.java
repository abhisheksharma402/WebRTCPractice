package com.example.webrtc.demo.security;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class Conf implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://660ba7c68189eb0008ee425d--dainty-dusk-b4dc92.netlify.app/") // Allow all origins (you can specify specific origins here)
                .allowedMethods("*"); // Allow all HTTP methods (GET, POST, PUT, DELETE, etc.)
    }
}
