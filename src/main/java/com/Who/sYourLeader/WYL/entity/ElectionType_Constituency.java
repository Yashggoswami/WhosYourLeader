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
@Table(name="electiontype_constituency")
public class ElectionType_Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    long constituencyId;

}
