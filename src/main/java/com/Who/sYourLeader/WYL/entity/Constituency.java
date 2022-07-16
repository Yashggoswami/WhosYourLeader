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
@Table(name="constituency")
public class Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long constituencyId;

    @Column(name="constituency_name",nullable = false)
    String constituencyName;

    //  one to many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="constituencyId",referencedColumnName = "constituencyId")
    Set<Candidate> candidates = new HashSet<>();

    //  many to many
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "constituencies")
    Set<ElectionType> electionTypes = new HashSet<>();
}
