package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class SmartPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String producer;
    private String model;
    private Double price;

    public SmartPhone(Integer id, String producer, String model, Double price) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public SmartPhone() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
