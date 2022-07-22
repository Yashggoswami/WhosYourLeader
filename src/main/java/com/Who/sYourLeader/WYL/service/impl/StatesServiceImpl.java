package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.entity.States;
import com.Who.sYourLeader.WYL.repository.StatesRepository;
import com.Who.sYourLeader.WYL.service.StatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatesServiceImpl implements StatesService {


    @Autowired
    StatesRepository statesRepository;


    @Override
    public List<States> getStatesByElectionIdAndElectionTypeId(Long electionid, Long electiontypeid) {
        return statesRepository.findStatessByElectionsElectionIdAndElectionTypesElectiontypeId(electionid,electiontypeid);
    }
}
