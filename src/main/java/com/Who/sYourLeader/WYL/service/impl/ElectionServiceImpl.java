package com.Who.sYourLeader.WYL.service.impl;

import com.Who.sYourLeader.WYL.entity.Election;
import com.Who.sYourLeader.WYL.repository.ElectionRepository;
import com.Who.sYourLeader.WYL.service.ElectionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ElectionServiceImpl implements ElectionService {
    @Autowired
    EntityManager entityManager;

    ElectionServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Autowired
    ElectionRepository electionRepository;

    @Override
    public List<Election> getElectionType(String id) {
        String jpql = "Select e from Election e where electionId = " + id;
        TypedQuery<Election> query = entityManager.createQuery(jpql, Election.class);
        return query.getResultList();
    }

    @Override
    public List<Election> getAllElections() {
        return electionRepository.findAll().stream().collect(Collectors.toList());
    
    }
}
