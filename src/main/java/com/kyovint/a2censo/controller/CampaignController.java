package com.kyovint.a2censo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyovint.a2censo.model.Campaign;
import com.kyovint.a2censo.service.CampaignService;

@RestController
@RequestMapping("/campaign")
public class CampaignController {
	@Autowired
	private CampaignService campaignService;
	
	@GetMapping("/getAll")
	public List<Campaign> getAllCampaigns(){
		return campaignService.getAllCampaigns();
	}
	
	@GetMapping("/{field}"+"ASC")
	public List<Campaign> getCampaignsWithSortASC(@PathVariable String field){
		List<Campaign> campaigns = campaignService.getCampaignsWithSortASC(field);
		return campaigns;
	}
	
	@GetMapping("/{field}"+"DESC")
	public List<Campaign> getCampaignsWithSortDESC(@PathVariable String field){
		List<Campaign> campaigns = campaignService.getCampaignsWithSortDESC(field);
		return campaigns;
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Campaign campaign) {
		campaignService.saveCampaign(campaign);
		return "Nueva compañia creada";
	}
	
	
	@DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
		campaignService.delete(id);
        return "Campaña Borrada "+id;
    }
	
}
