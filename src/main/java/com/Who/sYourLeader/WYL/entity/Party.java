package com.Who.sYourLeader.WYL.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="party")
public class Party {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long partyId;

    @Column(name="party_name",nullable = false)
    public String partyName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="partyId",referencedColumnName = "partyId")
    @JsonIgnore
    public Set<Candidate> candidates = new HashSet<>();

}
