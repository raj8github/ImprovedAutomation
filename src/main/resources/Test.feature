@tag
Feature: Testing a Website
  I want to use this template for my feature file

  Scenario: Test Login Page
    Given I goto Login Page
    When I enter "raj8aus@gmail.com" and "Test123"
    Then I validate login page details