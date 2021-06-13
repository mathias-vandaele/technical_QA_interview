Feature: We Verify if wikipedia knows about our coin

  Scenario: Check if Wikipedia knows about our code
    Given Set our favourite coin to "Monero"
    When Open google
    And Make a google search
    Then Verify There is a wikipedia link
