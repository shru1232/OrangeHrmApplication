Feature: test Orange HRM application

  Scenario: Validate the login functionality
    Given user should be on the "chrome" browser
    When user enters valide credentials
    Then user clicks on the login button

  Scenario: Validate HomePage functionality
    When user validate home page logo
    And user validate home page title
    And user validate url
    And user click on pim page
