package com.redhat.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;

    public Product() {
    }

    public Product(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', content='%s']",
                id, name, content);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
