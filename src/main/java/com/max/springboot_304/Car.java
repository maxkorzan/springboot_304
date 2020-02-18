package com.max.springboot_304;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private int year;

    @NotNull
    private String name;

    @NotNull
    private String model;
    //////////////////////////////////////////////////////////////////////////
    public Car(){
    }

    public Car(@NotNull int year, @NotNull String name, @NotNull String model) {
        this.year = year;
        this.name = name;
        this.model = model;
    }
    //////////////////////////////////////////////////////////////////////////
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
