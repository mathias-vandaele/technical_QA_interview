package com.capitoleconsulting.technicalqainterview.testengine.example.controllers;

import com.capitoleconsulting.technicalqainterview.testengine.core.DefaultService;
import com.capitoleconsulting.technicalqainterview.testengine.models.ServiceInformation;

public class CoinGeckoController extends DefaultService {

    /**
     * Constructor
     *
     * @param serviceInformation
     */
    protected CoinGeckoController(ServiceInformation serviceInformation) {
        super(serviceInformation);
    }

    public void pingService() {
        super.sendGetToService()
    }
}
