package com.sales.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sales")
public class SalesProperties {

    private Integer id;
    private String category;
    private String name;
    private float weight;
    private String unit;
    private float unit_price;
    private float total_price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getUnit() {
        return unit;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public float getTotal_price() {
        return total_price;
    }

    public String getCategory() {
        return category;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }
}
