package com.knf.dev.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name="Booktable")
@Table
public class Product {

    @Id
    private long id;

    private String name;
    private String price;
    private String image;

}
