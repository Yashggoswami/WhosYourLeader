package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.service.CandidateService;
import com.Who.sYourLeader.WYL.service.ElectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class CandidateController{

    public CandidateController(CandidateService candidateService, ElectionService electionService) {
        this.candidateService = candidateService;
        this.electionService = electionService;
    }

    private CandidateService candidateService;
    private ElectionService electionService;
    @GetMapping("/candidates")
    public String getCandidates(Model model){
        model.addAttribute("elections",electionService.getAllElections());
        model.addAttribute("candidates",candidateService.getAllCandidate());
        return "home";
    }

    @GetMapping("/election/{id}")
     public String getElectionType(@PathVariable String id , Model model){
        model.addAttribute("elections",electionService.getElectionType(id));
        return "home1";
    }
}



