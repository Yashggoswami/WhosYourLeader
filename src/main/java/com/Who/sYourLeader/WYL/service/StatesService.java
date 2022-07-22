package com.Who.sYourLeader.WYL.service;


import com.Who.sYourLeader.WYL.entity.States;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatesService {

//    @GetMapping("/states/{electionid}/{electiontypeid}")
//    public List<States> getElectionTypeByElectionId(@PathVariable("electionid") Long electionid, @PathVariable("electiontypeid") Long electiontypeid){
//        return statesRepository.findStatessByElectionsElectionIdAndElectionTypesElectiontypeId(electionid,electiontypeid);
//    }
    
    List<States> getStatesByElectionIdAndElectionTypeId(Long electionid,Long electiontypeid);
    
}
