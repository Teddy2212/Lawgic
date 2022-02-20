package com.asiana.lawgic.lawgic.vo;

import com.asiana.lawgic.lawgic.entity.Category;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LawyerVO {
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
