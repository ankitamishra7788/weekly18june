package com.example.weekly.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    @Qualifier("blue")
    Car c;

    @GetMapping("color")
    public String getColor(){
        return c.getColor();
    }
}
