package com.kyovint.a2censo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kyovint.a2censo.model.Campaign;
import com.kyovint.a2censo.repository.CampaignRepository;


@Service
public class CampaignServiceImpl implements CampaignService{

	@Autowired
	private CampaignRepository campaignRepository;
	
	
	@Override
	public Campaign saveCampaign(Campaign campaign) {
		return campaignRepository.save(campaign);
	}
	
	@Override
	public List<Campaign> getAllCampaigns(){
		return campaignRepository.findAll();
	}
	
	@Override
	public void delete(Integer id){
		campaignRepository.deleteById(id);
	   }
	
	@Override
	public List<Campaign> getCampaignsWithSortASC(String field){
		return campaignRepository.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	
	@Override
	public List<Campaign> getCampaignsWithSortDESC(String field){
		return campaignRepository.findAll(Sort.by(Sort.Direction.DESC, field));
	}
	
}
