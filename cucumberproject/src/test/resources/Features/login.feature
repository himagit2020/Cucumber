#Author: Heema
#Date: 02/14/2021
#Description: Regression Suite
Feature: Login

  @SmokeTest
  Scenario: Verify User Login with valid user credentials 2
    Given Already registered user access the url
    When User clicks on login link
    And User enters username to the username box
    And User enters userpassword to the userpassword box
    And User clicks on the login button
    Then User navigate to home page
    Then Click on Logout

  @SmokeTest
  Scenario: Verify User Login with valid user credentials 1
    Given Already registered user access the url
    When User clicks on login link
    And User enters username to the username box
    And User enters userpassword to the userpassword box
    And User clicks on the login button
    Then User navigate to home page
    Then Click on Logout

  @RegressionTest
  Scenario: Verify User Login with valid user credentials 1
    Given Already registered user access the url
    When User clicks on login link
    And User enters username to the username box
    And User enters userpassword to the userpassword box
    And User clicks on the login button
    Then User navigate to home page
    Then Click on Logout
    Then Close Browser

  @RegressionTest
  Scenario: Verify User Login with valid user credentials 2
    Given Already registered user access the url
    When User clicks on login link
    And User enters username to the username box
    And User enters userpassword to the userpassword box
    And User clicks on the login button
    Then User navigate to home page
    Then Click on Logout
    Then Close Browser
