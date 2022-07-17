package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.service.CandidateService;
import com.Who.sYourLeader.WYL.service.impl.CandidateServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CandidateController{



    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
    private CandidateService candidateService;
    @GetMapping("/candidates")
    public String getCandidates(Model model){
        model.addAttribute("candidates",candidateService.getAllCandidate());
        return "index";
    }

    @GetMapping("/allcandidates")
    public List<CandidateDto> getAllCandidates(){
        return candidateService.getAllCandidate();
    }
}


