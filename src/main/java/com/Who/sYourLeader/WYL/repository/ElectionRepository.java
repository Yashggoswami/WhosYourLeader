package com.Who.sYourLeader.WYL.repository;


import com.Who.sYourLeader.WYL.entity.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElectionRepository extends JpaRepository<Election, Long> {
}
