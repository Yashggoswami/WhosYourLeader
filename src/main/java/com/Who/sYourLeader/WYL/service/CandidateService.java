package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.entity.Party;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {

    List<Candidate> getAllCandidate();


//    List<Candidate> getAllCandidateByPartyId(long id);

//    List<Candidate> getAllCandidateByConstituencyId(long id);




}
