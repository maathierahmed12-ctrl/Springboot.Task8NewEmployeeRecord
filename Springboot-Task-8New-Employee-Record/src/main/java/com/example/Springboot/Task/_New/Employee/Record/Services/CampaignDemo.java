package com.example.Springboot.Task._New.Employee.Record.Services;

import com.example.Springboot.Task._New.Employee.Record.Entities.Campaign;
import com.example.Springboot.Task._New.Employee.Record.Entities.CampaignManager;

public class CampaignDemo {

        public static void main(String[] args) {

            CampaignManager manager = new CampaignManager();

            manager.displayCampaigns();

            System.out.println("POST Operation");

            Campaign newCampaign =
                    new Campaign("C104", "Ramadan Offer", "Facebook Ads", 700);

            System.out.println(manager.addCampaign(newCampaign));

            System.out.println();

            manager.displayCampaigns();
        }
    }

