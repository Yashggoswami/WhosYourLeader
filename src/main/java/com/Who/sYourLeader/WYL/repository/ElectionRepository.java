package com.Who.sYourLeader.WYL.repository;


import com.Who.sYourLeader.WYL.entity.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Long> {
}
