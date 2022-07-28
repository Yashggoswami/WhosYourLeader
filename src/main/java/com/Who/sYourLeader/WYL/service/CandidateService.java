package com.Who.sYourLeader.WYL.service;
import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.entity.Candidate;

import java.util.List;



public interface CandidateService {

//     public void addCandidate(Candidate candidate);
     public Candidate UpdateCandidate(Candidate candidate);
     List<CandidateDto> getAllCandidate();
     List<CandidateDto> getCandidates(Long id);
     CandidateDto convertEntityToDto(Candidate candidate);

     public void deleteCandidate(Long id);
}
