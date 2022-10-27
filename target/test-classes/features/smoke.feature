Feature: login Test

  @smoke
  Scenario: Login test scenarios
    Given login as tek user to retail app with username "test.user@tekschool.us" and password "Tek@12345"
    Then assert application title "React App"
    
