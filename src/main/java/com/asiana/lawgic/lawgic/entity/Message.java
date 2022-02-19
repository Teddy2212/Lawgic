package com.asiana.lawgic.lawgic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@Embeddable
public class Message extends BaseEntity{

    private String content;

    private String sender;

    private MessageType type;
}
