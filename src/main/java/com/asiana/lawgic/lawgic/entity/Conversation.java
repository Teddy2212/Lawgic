package com.asiana.lawgic.lawgic.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Conversation{

    private Long csno;

    @Id
    private String chatId;

    @ElementCollection(fetch= FetchType.LAZY)
    List<Message> messages=new ArrayList<>();

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Lawyer lawyer;

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Client client;
}
