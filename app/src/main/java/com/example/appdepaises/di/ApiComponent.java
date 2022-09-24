package com.example.appdepaises.di;

import com.example.appdepaises.model.CountriesService;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

}
