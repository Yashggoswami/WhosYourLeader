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
@Table(name="electiontype")
public class ElectionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long electiontypeId;

    @Column(name="electiontype_name",nullable = false)
    String electiontypeName;

    // many to many

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "electionTypes")
    @JsonIgnore
    Set<Election> elections = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinTable(name = "electiontype_constituency",
            joinColumns = { @JoinColumn(name = "electiontype_id")},
            inverseJoinColumns = { @JoinColumn (name = "constituency_id")})
    Set<Constituency> constituencies = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinTable(name = "electiontype_states",
            joinColumns = { @JoinColumn(name = "electiontype_id")},
            inverseJoinColumns = { @JoinColumn (name = "state_id")})
    Set<States> states = new HashSet<>();
}
