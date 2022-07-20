package com.Who.sYourLeader.WYL.service;

import com.Who.sYourLeader.WYL.entity.Constituency;
import com.Who.sYourLeader.WYL.entity.ElectionType;

import java.util.List;

public interface ConstituencyService {
    List<Constituency> getConstituencyById(Long id);
}
