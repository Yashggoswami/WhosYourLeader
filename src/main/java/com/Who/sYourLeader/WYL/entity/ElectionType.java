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
@Table(name="electiontype")
public class ElectionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long electionTypeId;

    @Column(name="electiontype_name",nullable = false)
    String electionTypeName;

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "electionTypes")
    Set<Election> elections = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "electiontype_constituency",
            joinColumns = { @JoinColumn(name = "electiontype_id")},
            inverseJoinColumns = { @JoinColumn (name = "constituency_id")})
    Set<Constituency> constituencies = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "electiontype_states",
            joinColumns = { @JoinColumn(name = "electiontype_id")},
            inverseJoinColumns = { @JoinColumn (name = "state_id")})
    Set<States> states = new HashSet<>();
}
