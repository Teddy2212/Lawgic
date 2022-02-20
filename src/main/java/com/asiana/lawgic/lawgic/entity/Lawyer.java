package com.asiana.lawgic.lawgic.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Lawyer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long lawyerId;

    private String password;

    private String name;

    private String address;

    private String email;

    private String phone;

    private boolean valid;

    private boolean gender;

    private Category categoryId;



}
