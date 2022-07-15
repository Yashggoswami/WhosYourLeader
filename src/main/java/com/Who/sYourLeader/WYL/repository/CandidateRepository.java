package com.Who.sYourLeader.WYL.repository;

import com.Who.sYourLeader.WYL.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
