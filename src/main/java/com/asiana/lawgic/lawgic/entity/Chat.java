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
public class Chat {
    @Column(name="chat_id")
    @Id
    private String chatId;

    @Column(name="message_id")
    @ElementCollection(fetch= FetchType.LAZY)
    List<Message> messages=new ArrayList<>();

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE )
    @JoinColumn(name="lawyer_id")
    private Lawyer lawyer;


    @JoinColumn(name="client_id")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Client client;

    @JoinColumn(name="consult_id")
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REMOVE)
    private Consult consult;
}
