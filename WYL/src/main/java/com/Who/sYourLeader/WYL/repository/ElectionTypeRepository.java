package com.Who.sYourLeader.WYL.repository;


import com.Who.sYourLeader.WYL.entity.ElectionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElectionTypeRepository extends JpaRepository<ElectionType, Long> {

    public List<ElectionType> findElectionTypesByElectionsElectionId(Long ElectionId);

}
