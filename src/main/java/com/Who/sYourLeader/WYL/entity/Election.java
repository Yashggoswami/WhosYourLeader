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
@Table(name="election")
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long electionId;

    @Column(name="election_name",nullable = false)
    String electionName;

    //many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "election_electiontype",
            joinColumns = { @JoinColumn(name = "election_id")},
            inverseJoinColumns = { @JoinColumn (name = "electiontype_id")})
    Set<ElectionType> electionTypes = new HashSet<>();

    // many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "election_states",
            joinColumns = { @JoinColumn(name = "election_id")},
            inverseJoinColumns = { @JoinColumn (name = "state_id")})
    Set<States> states = new HashSet<>();
}
