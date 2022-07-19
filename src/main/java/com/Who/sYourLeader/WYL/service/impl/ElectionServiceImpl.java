package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.entity.Election;
import com.Who.sYourLeader.WYL.repository.ElectionRepository;
import com.Who.sYourLeader.WYL.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ElectionServiceImpl implements ElectionService {

    @Autowired
    ElectionRepository electionRepository;

    public ElectionServiceImpl(ElectionRepository electionRepository) {
        this.electionRepository = electionRepository;
    }

    @Override
    public List<Election> getAllElections() {
        return electionRepository.findAll().stream().collect(Collectors.toList());
    }
}
