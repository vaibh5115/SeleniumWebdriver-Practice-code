Feature: Hooks in cucumber


Scenario: Add new customer
Given user is on add cutomer page
When user fills the customer details
Then customer is added successfully

Scenario: Edit customer
Given user is on Edit cutomer page
When user edit the customer contact detail
Then customer contact details updated successfully

Scenario: Delete customer
Given user is on delete cutomer page
When user delete the customer details
Then customer is deleted successfully



