package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.entity.ElectionType;
import com.Who.sYourLeader.WYL.repository.ElectionTypeRepository;
import com.Who.sYourLeader.WYL.service.ElectionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionTypeServiceImpl implements ElectionTypeService {

    @Autowired
    ElectionTypeRepository electionTypeRepository;

    @Override
    public List<ElectionType> getAllElectionTypes() {
        return electionTypeRepository.findAll();
    }

    @Override
    public List<ElectionType> getElectionTypeByElectionId(Long id) {
        return electionTypeRepository.findElectionTypesByElectionsElectionId(id);

    }


}
