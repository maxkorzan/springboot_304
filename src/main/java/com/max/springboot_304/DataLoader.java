package com.max.springboot_304;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String ... strings) throws Exception{
        Car car;
        car = new Car(1999, "Chevrolet","cavalier");
        repository.save(car);

        car = new Car(2001, "Ford","F-150");
        repository.save(car);

        car = new Car(2008, "Honda","Accord lx");
        repository.save(car);
    }
}