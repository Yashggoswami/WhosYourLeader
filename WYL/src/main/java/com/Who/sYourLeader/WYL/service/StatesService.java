package com.Who.sYourLeader.WYL.service;


import com.Who.sYourLeader.WYL.entity.States;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatesService {

    List<States> getStatesByElectionIdAndElectionTypeId(Long electionid,Long electiontypeid);

}