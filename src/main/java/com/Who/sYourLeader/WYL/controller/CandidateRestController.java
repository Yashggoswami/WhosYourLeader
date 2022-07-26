package com.Who.sYourLeader.WYL.controller;

import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.entity.Constituency;
import com.Who.sYourLeader.WYL.entity.Election;
import com.Who.sYourLeader.WYL.entity.ElectionType;
import com.Who.sYourLeader.WYL.entity.States;
import com.Who.sYourLeader.WYL.service.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@Controller

@AllArgsConstructor
@NoArgsConstructor
public class CandidateRestController {
        @Autowired
        private ElectionService electionService;

        @Autowired
        private ElectionTypeService electionTypeService;

        @Autowired
        private StatesService statesService;

        @Autowired
        private ConstituencyService constituencyService;

        @Autowired
        private CandidateService candidateService;



//        @GetMapping("/candidates")
//        public String getCandidates(Model model){
//            model.addAttribute("elections",electionService.getAllElections());
//            model.addAttribute("candidates",candidateService.getAllCandidate());
//            return "home";
//        }
//
//        @GetMapping("/election/{id}")
//        public String getElectionType(@PathVariable String id , Model model){
//            model.addAttribute("elections",electionService.getElectionType(id));
//            return "home1";
//        }

        @GetMapping("/elections")
        public List<Election> getAllElection(){
            return electionService.getAllElections();
        }



        @GetMapping("/electionTypes")
        public List<ElectionType> getAllElectionType()
        {
            return electionTypeService.getAllElectionTypes();
        }



        @GetMapping("/electiontype/{electionid}")
        public List<ElectionType> getElectionTypesByElectionId(@PathVariable Long electionid){
            return electionTypeService.getElectionTypeByElectionId(electionid);
        }

        @GetMapping("/states/{electionid}/{electiontypeid}")
        public List<States> getStateByElectionIdAndElectionTypeId(@PathVariable("electionid") Long electionid, @PathVariable("electiontypeid") Long electiontypeid){
            return statesService.getStatesByElectionIdAndElectionTypeId(electionid,electiontypeid);
        }


        @GetMapping("/constituency/{electiontypeid}/{stateid}")
        public List<Constituency> getConstituency(@PathVariable("electiontypeid") Long electiontypeid, @PathVariable("stateid") Long stateid){
            return constituencyService.getConstituencyByElectionTypeIdAndStateId(electiontypeid, stateid);
        }


        @GetMapping("/candidates/{constituencyid}")
        public List<CandidateDto> getCandidates(@PathVariable Long constituencyid){
            return candidateService.getCandidates(constituencyid);
        }
}
