package com.example.Springboot.Task._New.Employee.Record.Entities;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {


        private List<Campaign> campaigns = new ArrayList<>();

        public CampaignManager() {

            campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
            campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
            campaigns.add(new Campaign("C103", "Email Promo", "Email", 300));
        }

        public String addCampaign(Campaign campaign) {

            for (Campaign c : campaigns) {
                if (c.getCampaignId().equalsIgnoreCase(campaign.getCampaignId())) {
                    return "Campaign ID already exists No campaign was created";
                }
            }

            campaigns.add(campaign);

            return "Campaign Created Successfully..."
                    + "Campaign ID: " + campaign.getCampaignId() + "..."
                    + "Campaign Name: " + campaign.getCampaignName() + "..."
                    + "Platform: " + campaign.getPlatform() + "..."
                    + "budget: " + campaign.getBudget() + "..."
                    + "Status: Active";
        }

        public void displayCampaigns() {

            System.out.println("=== Campaign List ===");

            for (Campaign c : campaigns) {
                System.out.println(c.getCampaignId()
                        + " -> " + c.getCampaignName()
                        + " -> " + c.getPlatform()
                        + " -> " + c.getBudget());
            }
        }
    }

