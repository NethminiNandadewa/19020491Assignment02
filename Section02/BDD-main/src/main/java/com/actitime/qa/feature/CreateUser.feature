Feature: As admin I should be able add a new user to Actitime.

  @TC_002
 Scenario Outline: Creating a new user
    Given User is logged in as admin
    And User is in Actitime Users Page
    When User click the new user button
    Then User Enter the First Name as  "<firstname>"
    Then User Enter the Last Name as  "<lastname>"
    Then User Enter the Email as  "<email>"
    Then User click the save & send invitation button
    Then User get a validation message as "<email>"
    Examples:
      | firstname  | lastname |email|
      | Dilki |Premarathna |dilki2757@gmail.com|