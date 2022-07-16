package com.Who.sYourLeader.WYL.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Column(name="candidate_name", nullable = false)
    public String candidateName;

    @Column(name="candidate_image", nullable = false)
    public String candidateImage;

    @Column(name="candidate_status", nullable = false)
    public String candidateStatus;

//    foreign key oneToMay party->parent table partyId
//    foreign key ManyToMany constituency->parent table constituencyId



}


