package com.Who.sYourLeader.WYL.repository;

import com.Who.sYourLeader.WYL.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findCandidateByPartyId(Long id);

    List<Candidate> findCandidateByConstituencyId(Long id);
//    List<Candidate> findCandidateByPartyId(long id);
    
    
}
