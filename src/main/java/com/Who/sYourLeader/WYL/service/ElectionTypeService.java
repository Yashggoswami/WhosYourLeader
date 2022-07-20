package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.ElectionType;

import java.util.List;

public interface ElectionTypeService {
    List<ElectionType> getElectionTypeById(Long id);
}
