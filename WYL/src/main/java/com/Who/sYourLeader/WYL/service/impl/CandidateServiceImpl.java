package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.dto.CandidateDto;
import com.Who.sYourLeader.WYL.entity.Candidate;
import com.Who.sYourLeader.WYL.repository.CandidateRepository;
import com.Who.sYourLeader.WYL.service.CandidateService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    public CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        super();
        this.candidateRepository = candidateRepository;
    }
    @Autowired
    public ModelMapper modelMapper;
    @Override
    public List<CandidateDto> getAllCandidate(){
        return candidateRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public List<CandidateDto> getCandidates(Long id){
          return candidateRepository.getCandidatesByConstituency_ConstituencyId(id).stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public CandidateDto convertEntityToDto(Candidate candidate){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        CandidateDto candidateDto = new CandidateDto();
        candidateDto = modelMapper.map(candidate,CandidateDto.class);
        return candidateDto;
    }

}
