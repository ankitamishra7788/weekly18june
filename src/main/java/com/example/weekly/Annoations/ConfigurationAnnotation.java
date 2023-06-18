package com.example.weekly.Annoations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfigurationAnnotation {

    @Bean("blue")
    public Car getCarObject1()
    {
        return new Car(color: "Blue");
        System.out.println("first"+color);
    }
    @Bean("red")
    public Car getCarObject2()
    {
        return new Car(color: "Red");
        System.out.println("second"+color);
    }
}
