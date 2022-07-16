package com.Who.sYourLeader.WYL.repository;


import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyRepository extends JpaRepository<Party, Long> {
    public static List<Candidate> findCandidateByPartyId(long id) {
        return null;
    }
}
