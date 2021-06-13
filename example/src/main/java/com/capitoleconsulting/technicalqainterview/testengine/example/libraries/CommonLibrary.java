package com.capitoleconsulting.technicalqainterview.testengine.example.libraries;

import com.capitoleconsulting.technicalqainterview.testengine.example.controllers.CommonController;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonLibrary {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final CommonController commonController;

    public CommonLibrary(){
        this.commonController = CommonController.getINSTANCE();
    }

    @Before
    public void beforeTests(Scenario scenario){
        System.out.println("Hello, here is the beginning of our coin gecko test");
    }

    @Given("Connexion to CoinGecko ok")
    public void connexionToCoinGeckoOk()
    {
        LOGGER.info("checking if we can access to CoinGecko");
        this.commonController.getCoinGeckoController().pingService();
    }
}
