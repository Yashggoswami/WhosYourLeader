package com.Who.sYourLeader.WYL.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="states")
public class States {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long stateId;

    @Column(name="state_name",nullable = false)
    String  stateName;
}
