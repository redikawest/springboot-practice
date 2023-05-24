package com.example.practice.catalog.logic;

import org.springframework.stereotype.Service;
import com.example.practice.catalog.Interface.GreetingServiceInterface;
import com.example.practice.catalog.config.ApplicationProperties;
import com.example.practice.catalog.config.CloudProperties;


@Service
public class GreetingService implements GreetingServiceInterface 
{

    private ApplicationProperties appProperties;
    private CloudProperties cloudProperties;

    public GreetingService(ApplicationProperties appProperties, CloudProperties cloudProperties) {
        this.appProperties = appProperties;
        this.cloudProperties = cloudProperties;
    }

    @Override
    public String sayGreeting() {
        System.out.println(cloudProperties.getApiKey());
        return appProperties.getWelcomeText();
    }

    @Override
    public String getCurrency() {
        return appProperties.getCurrency();
    }

    @Override
    public String getTimezone() {
        return appProperties.getTimezone();
    }
    
}
