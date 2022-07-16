package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImp implements CandidateService{

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public List<Candidate> getAllCandidate() {
        return candidateRepository.findAll();
    }

//    @Override
//    public List<Candidate> getAllCandidateByPartyId(long id) {
//        return candidateRepository.findCandidateByPartyId(id);
//    }

//    @Override
//    public List<Candidate> getAllCandidateByConstituencyId(long id) {
//        return null;
//    }

}
