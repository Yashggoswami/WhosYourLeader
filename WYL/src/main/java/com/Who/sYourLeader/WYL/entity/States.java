package com.Who.sYourLeader.WYL.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="states")
public class States {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long stateId;

    @Column(name="state_name",nullable = false)
    String  stateName;

    // one to many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="stateId",referencedColumnName = "stateId")
    @JsonIgnore
    Set<Constituency> constituencies = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "states")
    @JsonIgnore
    Set<ElectionType> electionTypes = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "states")
    @JsonIgnore
    Set<Election> elections = new HashSet<>();
}
