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
@Table(name="constituency_candidate")
public class Constituency_Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
