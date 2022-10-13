package com.capitoleconsulting.technicalqainterview.testengine.example.libraries;

import com.capitoleconsulting.technicalqainterview.testengine.example.controllers.CommonController;
import com.capitoleconsulting.technicalqainterview.testengine.example.core.Main;
import com.capitoleconsulting.technicalqainterview.testengine.example.model.CoinGeckoInfo;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;

public class CommonLibrary {

    private static final Logger logger = LogManager.getLogger(CommonLibrary.class);
    private final CommonController commonController;

    private final CoinGeckoInfo coinGeckoInfo;

    public CommonLibrary(){
        this.commonController = CommonController.getINSTANCE();
        this.coinGeckoInfo = new CoinGeckoInfo();
    }

    @Before
    public void beforeTests(Scenario scenario){
        logger.info("Hello, here is the beginning of our coin gecko test : {}", scenario.getName());
    }

    @Given("Connexion to CoinGecko ok")
    public void connexionToCoinGeckoOk()
    {
        logger.info("checking if we can access to CoinGecko");
        Assert.assertEquals(200 , this.commonController.getCoinGeckoController().pingService().code());
    }

    @When("Open {string}")
    public void open(String url) {
        this.commonController.uiController.open(url);
    }
}
