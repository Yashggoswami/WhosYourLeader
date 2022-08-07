package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.Election;

import java.util.List;

public interface ElectionService {

    List<Election> getElectionType(String id);

    List<Election> getAllElections();
}