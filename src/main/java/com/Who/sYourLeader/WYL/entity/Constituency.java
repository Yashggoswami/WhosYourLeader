package com.Who.sYourLeader.WYL.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="constituency")
public class Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long constituencyId;

    @Column(name="constituency_name",nullable = false)
    String constituencyName;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnore
    @JoinColumn(name = "stateId",referencedColumnName = "stateId")
    States state;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name="constituencyId",referencedColumnName = "constituencyId")
    Set<Candidate> candidates = new HashSet<>();

    //  many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "constituencies")
    @JsonIgnore
    Set<ElectionType> electiontypes = new HashSet<>();
}
