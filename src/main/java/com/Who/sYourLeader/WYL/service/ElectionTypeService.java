package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.ElectionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ElectionTypeService {


    List<ElectionType> getAllElectionTypes();

    List<ElectionType> getElectionTypeByElectionId(Long id);

}
