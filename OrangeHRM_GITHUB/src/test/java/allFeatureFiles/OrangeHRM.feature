Feature: test Orange HRM application

  Scenario: Validate the login functionality
    Given user should be on the "chrome" browser
    When user enters valide credentials
    Then user clicks on the login button
