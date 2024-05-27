package com.boots.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;

@Card
@Table(name = "shopping_cart_items")
public class CategoryItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(1)
    @Max(10)
    private int quantity;

    //Stores a copy of the product price during the time of order placement
    private double price;

    @OneToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
    private Category category;

    public CategoryItems() {

    }

    public CategoryItems(int quantity, Category category) {
        this.quantity = quantity;
        this.category = category;
        System.out.println("Price:"+ category.getPrice());
        this.price = category.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getProduct() {
        return category;
    }

    public void setProduct(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryItems that = (CategoryItems) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
