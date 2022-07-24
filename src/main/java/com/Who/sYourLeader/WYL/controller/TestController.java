package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.service.CandidateService;
import com.Who.sYourLeader.WYL.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private ElectionService electionService;

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/elections")
    public String getAllElection(Model model){
        model.addAttribute("elections",electionService.getAllElections());
        return "view";
    }

    @GetMapping("/candidates")
    public String getCandidates(Model model){
//        model.addAttribute("elections",electionService.getAllElections());
        model.addAttribute("candidates",candidateService.getAllCandidate());
        return "home1";
    }

}
