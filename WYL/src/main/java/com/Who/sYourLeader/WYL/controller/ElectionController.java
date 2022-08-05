package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.service.CandidateService;
import com.Who.sYourLeader.WYL.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableEurekaClient
@RequestMapping("/static")
public class ElectionController {
    @Autowired
    private CandidateService candidateService;
    @Autowired
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
