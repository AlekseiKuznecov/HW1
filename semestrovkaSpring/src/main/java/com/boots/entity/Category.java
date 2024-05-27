package com.boots.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Card
@NoArgsConstructor
@SuperBuilder
@Data
@Table(name = "products")
public class Category extends AbstractEntity {

    private String categoryName;

    private Double categoryBudget;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getCategoryBudget() {
        return categoryBudget;
    }

    public void setCategoryBudget(Double categoryBudget) {
        this.categoryBudget = categoryBudget;
    }
}
