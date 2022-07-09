package com.example.demo.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private Long phoneNo;
    private String name;
    private String password;
    private Integer age;
    private Character gender;
    private String address;
    private Integer planId;


}