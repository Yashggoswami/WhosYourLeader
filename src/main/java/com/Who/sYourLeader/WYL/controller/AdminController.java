package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AdminController {

    @Autowired
    CandidateService candidateService;


//    @PostMapping("/addCandidate")
//    public String addCandidateDetails(@RequestBody Candidate candidate)
//    {
//        candidateService.addCandidate(candidate);
//        return "added candidate data";
//    }

    @PutMapping("/updateCandidate")
    public Candidate UpdateCandidate(@RequestBody Candidate candidate)
    {
        return  candidateService.UpdateCandidate(candidate);
    }


    @DeleteMapping("/DeleteCandidate/{id}")
    public String DeleteCandidateDetails(@PathVariable("id") Long  id)
    {
        candidateService.deleteCandidate(id);
        return "Candidate Id= "+id+" deleted";
    }



}
