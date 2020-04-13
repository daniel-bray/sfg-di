package com.danielbraydevelopment.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class SettingInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setting";
    }
}
