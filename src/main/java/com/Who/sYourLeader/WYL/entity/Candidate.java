package com.Who.sYourLeader.WYL.entity;

import lombok.*;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long candidateId;

    @Column(name="candidate_name")
    public String candidateName;

    @Column(name="candidate_image")
    public String candidateImage;

    @Column(name="candidate_status")
    public String candidateStatus;

    @ManyToOne(fetch=FetchType.EAGER,optional=true)
    @JoinColumn(name="partyId")
    public Party party;

    @ManyToOne(fetch=FetchType.EAGER,optional=true)
    @JoinColumn(name="constituencyId")
    public Constituency constituency;
//    foreign key oneToMay party->parent table partyId
//    foreign key ManyToMany constituency->parent table constituencyId



}


