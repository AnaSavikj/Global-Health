package com.example.demo.model;

import lombok.Data;

@Data
public class Apteka {
    String id;
    String name;
    String location;

    public Apteka(String name,String id, String location) {
        this.id=id;
        this.name = name;
        this.location = location;
    }

    public Apteka() {
    }
}
