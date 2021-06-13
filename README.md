# technical_QA_interview
Capitole Consulting technical QA interview (Java/Selenium/Cucumber)

## Understand the topic

This exercise is a maven project that has already been partially done, your goal will be to implements the step in `technical_QA_interview/example/features/` 

This is composed of 2 differents modules ;

--> The testengine is not supposed to be touch, everything is already implemented in order to make you life simpler.

--> The example module is the one you have to work on 

you will have to implement :

2 steps for the "test" on the coinGecko API,
3 steps on the CoinPaprika API
4 steps for the google automationou 

## CoinGeckoFeature.feature

For the implementation of the CoinGeckoStep, be aware that you should call the API using `CoinGeckoController.java` 

## CoinPaprikaFeature.feature

Using the same pattern, you will create the `CoinPaprikaController.java` and implements the demanded steps, don't forget to add the `service_url` , `service_port` and `service_name` (which is the reference of the controller you will be calling the API with)

## GoogleCheck.feature

For the google implementation steps, try using the `UiController.java` and if you can use the `PageObject` pattern.
