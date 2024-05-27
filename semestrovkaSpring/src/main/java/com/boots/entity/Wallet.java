package com.boots.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Card
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Wallet extends AbstractEntity {

    private String walletName;

    private Date createdDate;

    private Long forecastId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_user_cart",joinColumns = {@JoinColumn(name = "cart_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "t_user_id", referencedColumnName = "id")})
    private Set<User> users;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Category category;

}
