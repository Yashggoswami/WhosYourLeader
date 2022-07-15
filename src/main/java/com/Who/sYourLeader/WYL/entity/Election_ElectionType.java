package com.Who.sYourLeader.WYL.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="election_electiontype")
public class Election_ElectionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @ManyToMany
    @JoinTable(name = "election_electiontype_election",
            joinColumns = @JoinColumn(name = "election_election_type_id", referencedColumnName = "election_id"))
    private Set<Election> elections = new LinkedHashSet<>();


    @ManyToMany
    @JoinTable(name = "election_electiontype_electiontype",
            joinColumns = @JoinColumn(name = "election_election_type_id", referencedColumnName = "electiontype_id"))
    private Set<ElectionType> electionTypes = new LinkedHashSet<>();

}
