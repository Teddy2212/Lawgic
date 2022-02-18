package com.asiana.lawgic.lawgic.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Consult {
    @Id
    private String consultId;

    private Date appointmentDate;

    private String lawyer;

    private String summary;

    private String judgement;

    private String comments;

    private String opponentName;

    private String opponentAddress;

    private Date opponentBirthday;

    private String opponentPhone;

    private String opponentCarType;

}
