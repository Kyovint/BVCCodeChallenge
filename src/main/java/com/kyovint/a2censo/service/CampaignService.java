package com.kyovint.a2censo.service;

import java.util.List;

import com.kyovint.a2censo.model.Campaign;

public interface CampaignService {

	public Campaign saveCampaign(Campaign campaign);
	
	public List<Campaign> getAllCampaigns();

	void delete(Integer id);

	public List<Campaign> getCampaignsWithSortASC(String field);

	List<Campaign> getCampaignsWithSortDESC(String field);

	
}
