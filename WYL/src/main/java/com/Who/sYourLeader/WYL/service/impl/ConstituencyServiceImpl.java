package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.entity.Constituency;
import com.Who.sYourLeader.WYL.repository.ConstituencyRepository;
import com.Who.sYourLeader.WYL.service.ConstituencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstituencyServiceImpl implements ConstituencyService {


    @Autowired
    ConstituencyRepository constituencyRepository;

    @Override
    public List<Constituency> getConstituencyByElectionTypeIdAndStateId(Long electiontypeid, Long stateid) {
        return constituencyRepository.findConstituencysByElectiontypes_ElectiontypeIdAndState_StateId(electiontypeid,stateid);
    }
}