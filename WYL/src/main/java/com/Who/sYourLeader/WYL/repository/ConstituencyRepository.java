package com.Who.sYourLeader.WYL.repository;

import com.Who.sYourLeader.WYL.entity.Constituency;
import com.Who.sYourLeader.WYL.entity.States;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConstituencyRepository extends JpaRepository<Constituency, Long> {
    public List<Constituency> findConstituencysByElectiontypes_ElectiontypeIdAndState_StateId(Long electiontypeId, Long stateId);
}