package com.sales.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Goods {

    @Id
    @GeneratedValue
    private Integer id;
    private String category;
    private String name;
    private float weight;
    private String unit;
    private float unit_price;
    private float total_price;
    private Date create_time;
    private Date update_time;

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdate_time() {
        return update_time;
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

    public Integer getId() {

        return id;
    }

    public String getCategory() {
        return category;
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

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
