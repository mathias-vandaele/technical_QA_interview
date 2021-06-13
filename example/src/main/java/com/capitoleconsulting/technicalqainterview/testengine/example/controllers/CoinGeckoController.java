package com.capitoleconsulting.technicalqainterview.testengine.example.controllers;

import com.capitoleconsulting.technicalqainterview.testengine.core.DefaultService;
import com.capitoleconsulting.technicalqainterview.testengine.models.ServiceInformation;
import lombok.SneakyThrows;
import okhttp3.Response;

import java.util.HashMap;

public class CoinGeckoController extends DefaultService {

    /**
     * Constructor
     *
     * @param serviceInformation
     */
    protected CoinGeckoController(ServiceInformation serviceInformation) {
        super(serviceInformation);
    }

    @SneakyThrows
    public Response pingService() {
        return super.sendGetToService("/api/v3/ping", new HashMap<>(), new HashMap<>());
    }
}
