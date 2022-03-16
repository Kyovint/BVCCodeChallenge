package com.kyovint.a2censo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyovint.a2censo.model.Campaign;


@Repository
public interface CampaignRepository extends JpaRepository<Campaign,Integer>{

}
