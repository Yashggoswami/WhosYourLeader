package com.Who.sYourLeader.WYL.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="party")
public class Party {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long partyId;

    @Column(name="party_name",nullable = false)
    String partyName;

    @OneToMany(mappedBy = "party")
    private Set<Candidate> candidates = new HashSet<>();
}
