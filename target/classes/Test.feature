@tag
Feature: Testing a Website
  I want to use this template for my feature file

  Scenario Outline: Test Login Page
    Given I goto Login Page
    When I enter <email> and <passwd>
    Then I validate login page details

    Examples: 
      | email             | passwd  |
      | raj8aus@gmail.com | Test123 |
