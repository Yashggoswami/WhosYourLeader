package com.Who.sYourLeader.WYL.service;
import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.entity.Candidate;

import java.util.List;



public interface CandidateService {


     List<CandidateDto> getAllCandidate();

     CandidateDto convertEntityToDto(Candidate candidate);

}
