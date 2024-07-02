@tag
Feature: SPARSH contact feature
  I want to use this template for my feature file

  @tag1
  Scenario: Validate the contact us page
    Given user has landed on the sparsh website in chrome
    When user enters firstname,lastname,email,phone.
    And selects hospital and for general enquiry.
    And clicks on send button.
    Then a message is displayed after successful form filling. 

  @tag2
 Scenario Outline: Title of your scenario outline
   Given user has landed on the sparsh website in chrome
    When user enters "<firstname>","<lastname>",email,phone.
    And selects hospital and for general enquiry.
    And clicks on send button.
    Then a message is displayed after successful form filling.

    Examples: 
     | firstname  | lastname |
     |     				|Raj   		 |
     | sagar      |   kumar  |
     | subhan	    | shaik    |
     | prashant   | kumbar   |
