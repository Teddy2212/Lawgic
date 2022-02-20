package com.asiana.lawgic.lawgic.vo;

import com.asiana.lawgic.lawgic.entity.MessageType;
import lombok.*;


@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageVO {
    private String content;
    private String sender;
    private MessageType type;

}
