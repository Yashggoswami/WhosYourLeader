package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.entity.Constituency;
import com.Who.sYourLeader.WYL.entity.Election;
import com.Who.sYourLeader.WYL.entity.ElectionType;
import com.Who.sYourLeader.WYL.entity.States;
import com.Who.sYourLeader.WYL.repository.*;
import com.Who.sYourLeader.WYL.service.CandidateService;
import com.Who.sYourLeader.WYL.service.ElectionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.hibernate.mapping.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@AllArgsConstructor
@NoArgsConstructor
public class CandidateController{

    @Autowired
    private CandidateService candidateService;
    private ElectionService electionService;

//    @GetMapping("/candidates")
//    public String getCandidates(Model model){
//        model.addAttribute("elections",electionService.getAllElections());
//        model.addAttribute("candidates",candidateService.getAllCandidate());
//        return "home";
//    }
//
//    @GetMapping("/election/{id}")
//     public String getElectionType(@PathVariable String id , Model model){
//        model.addAttribute("elections",electionService.getElectionType(id));
//        return "home1";
//    }
    @Autowired
    ElectionRepository electionRepository;
    @Autowired
    ElectionTypeRepository electionTypeRepository;

    @Autowired
    StatesRepository statesRepository;

    @Autowired
    ConstituencyRepository constituencyRepository;
    @Autowired
    CandidateRepository candidateRepository;
    @GetMapping("/elections")
    public List<Election> getElectionType(){
        return electionRepository.findAll();
    }
    @GetMapping("/electiontype/{id}")
    public List<ElectionType> getElectionTypeByElectionId(@PathVariable Long id){
        return electionTypeRepository.findElectionTypesByElectionsElectionId(id);
    }
    @GetMapping("/states/{electionid}/{electiontypeid}")
    public List<States> getElectionTypeByElectionId(@PathVariable("electionid") Long electionid, @PathVariable("electiontypeid") Long electiontypeid){
        return statesRepository.findStatessByElectionsElectionIdAndElectionTypesElectiontypeId(electionid,electiontypeid);
    }
    @GetMapping("/constituency/{electiontypeid}/{stateid}")
    public List<Constituency> getConstituency( @PathVariable("electiontypeid") Long electiontypeid, @PathVariable("stateid") Long stateid){
        return constituencyRepository.findConstituencysByElectiontypes_ElectiontypeIdAndState_StateId(electiontypeid,stateid);
    }
    @GetMapping("/candidates/{constituencyid}")
    public List<CandidateDto> getCandidates(@PathVariable Long constituencyid){
    return candidateService.getCandidates(constituencyid);
    }
}



