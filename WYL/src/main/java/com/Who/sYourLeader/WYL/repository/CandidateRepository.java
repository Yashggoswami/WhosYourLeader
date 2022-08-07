package com.Who.sYourLeader.WYL.repository;

import com.Who.sYourLeader.WYL.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> getCandidatesByConstituency_ConstituencyId(Long constituencyId);

}
