package com.Who.sYourLeader.WYL.repository;


import com.Who.sYourLeader.WYL.entity.States;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatesRepository extends JpaRepository<States, Long> {
    public List<States> findStatessByElectionsElectionIdAndElectionTypesElectiontypeId(Long electionId,Long electiontypeId);
}
