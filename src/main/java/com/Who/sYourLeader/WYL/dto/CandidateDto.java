package com.Who.sYourLeader.WYL.dto;

import lombok.Data;

@Data
public class CandidateDto {
    public long candidateId;
    public String candidateName;
    public String candidateImage;
    public String candidateStatus;
    public String partyName;
    public String constituencyName;
}
