package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.Constituency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConstituencyService {


    List<Constituency> getConstituencyByElectionTypeIdAndStateId(Long electiontypeid,Long stateid);

}
