Feature: MyAccount-Login Feature
Description: this feature will test a login functionality

#without passing parameters to step definitions file
#Scenario: Log-in with valid user name and password.
#Given Open browser
#When Enter the URL "http://practice.automationtesting.in" 
#And Click on My Account link
#And Enter registered user name and password
#And Click on login button
#Then User logged in successfully


#passing parameters to step definitions file
#Scenario: Log-in with valid user name and password.
#Given Open browser
#When Enter the URL "http://practice.automationtesting.in" 
#And Click on My Account link
#And Enter registered user name "vaibham@gmail.com" and password "Test@selenium123"
#And Click on login button
#Then User logged in successfully

#simple login with Scenario Outline and Examples keyword(DDT)
#passing multiple test data to step definitions file DDT
#Scenario Outline: Log-in with valid user name and password.
#Given Open browser
#When Enter the URL "http://practice.automationtesting.in" 
#And Click on My Account link
#And Enter registered user name "<user name>" and password "<password>"
#And Click on login button
#Then Verify login
#Then close all browser
#Examples:
#
#|user name|password|
#|xyz|admin|
#|pqr|admin|

#simple login with Data table parameter(DDT)
#data table without header
#passing multiple test data to step definitions file DDT
#Scenario: Log-in with valid user name and password.
#Given Open browser
#When Enter the URL "http://practice.automationtesting.in" 
#And Click on My Account link
#And Enter registered user name and pass
#|vaibham@gmail.com|Test@selenium123|  
#And Click on login button
#Then User logged in successfully
#Then Verify login
#Then close all browser


#simple login with Data table parameter(DDT)
#data table with header
#passing multiple test data to step definitions file DDT
Scenario: Log-in with valid user name and password.
Given Open browser
When Enter the URL "http://practice.automationtesting.in" 
And Click on My Account link
And Enter registered user name and pass
|user name|password|
|vaibham@gmail.com|Test@selenium123|  
And Click on login button
Then User logged in successfully
#Then Verify login
Then close all browser



