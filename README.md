# technical_QA_interview

Capitole Consulting technical QA interview (Java/Selenium/Cucumber)

This test aims to see your skills and what you are capable to implement using the given tools

Be aware that you must be comfortable with abstraction, inheritance etc .. 

For cucumber, you must be able to implement simple simple, make API calls using the given tools

For selenium, you must be able to interact with a simple page and verify the presence of an element

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

Here, we will try to implement one very simple test, that will verify is a specific crypto-currency is listed on coinGecko, the first step is already implemented; you can understand how I use the test engine to run my tests.

Here is the documentation you will need [Coingecko API](https://www.coingecko.com/en/api)

For the implementation of the CoinGeckoStep, be aware that you should call the API using `CoinGeckoController.java` 

## CoinPaprikaFeature.feature

For this feature, you shall do the same thing as you did in the previous feature, but you will have to implement it yourself, and create a specific controller for this service, which also extends `DefaultService.java` 

Don't forget to add the `service_url` , `service_port` and `service_name` (which is the reference of the controller you will be calling the API with)

Here is the documentation you will need [CoinParika API](https://api.coinpaprika.com/)

Again, if this sounds too unprecise, use the previous exercise as an example

## GoogleCheck.feature

This feature is about researching something on google and check if a wikipedia link is available on the first page.

For the google implementation steps, try using the `UiController.java` 

Here will be verified if you're confortable using Selenium, the UiController is already there, and one step is already implemented, in order to make it simpler for you.

You must use the `PageObject` model. here is the documentation https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/

## RUN THE PROJECT

you just have to run the main ine the `example` module with specifics environments variable

`feature=example/features;report=example/report;configuration=example/configuration/services.xml;CUCUMBER_PUBLISH_ENABLED=true`

Those are where your features are stored, where the report will be generated, and where the configuration (service_url etc ..) should be retrieved 

## Don't feel bad !

If there is something not clear for you, don't hesitate to come back to me, I will be adding some clarification

# Good luck !

![image](https://user-images.githubusercontent.com/26595978/121817763-99ea8e00-cc83-11eb-97c9-fdc056bfce3f.png)
