package com.asiana.lawgic.lawgic.vo;

import com.asiana.lawgic.lawgic.entity.Client;
import com.asiana.lawgic.lawgic.entity.Consult;
import com.asiana.lawgic.lawgic.entity.Lawyer;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatVO {
    private String chatId;

    private Lawyer lawyer;

    private Client client;

    private Consult consult;
}
