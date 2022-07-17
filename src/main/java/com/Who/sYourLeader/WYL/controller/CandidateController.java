package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.repository.CandidateRepository;
import com.Who.sYourLeader.WYL.service.CandidateServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CandidateController {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    CandidateServiceImp candidateServiceImp;

    @GetMapping("/candidate/getAllCandidate")
    public List<Candidate> getAll()
    {
        return candidateServiceImp.getAllCandidate();
    }

    @GetMapping("/candidate/party/{id}")
    public ResponseEntity<List<Candidate>> getAllCandidateByPartyId(@PathVariable(value = "id") Long id) {

        List<Candidate> tags = candidateRepository.findCandidateByPartyId(id);
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }

    @GetMapping("/candidate/consituency/{id}")
    public ResponseEntity<List<Candidate>> getAllCandidateByConstituencyId(@PathVariable(value = "id") Long id) {

        List<Candidate> tags = candidateRepository.findCandidateByConstituencyId(id);
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }


}


