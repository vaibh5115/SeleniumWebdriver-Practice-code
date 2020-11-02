Feature: Tags in cucumber

@SanityTest
Scenario: Verify login
Given This is valid login test

@SanityTest @End2EndTest
Scenario: Verify logout
Given This is logout test

@RegressionTest
Scenario: Verify search
Given This is search test

@RegressionTest @End2EndTest
Scenario: Verify advanced search
Given This is advanced search test

@End2EndTest
Scenario: Verify prepaid recharge
Given This is prepaid recharge test

@End2EndTest
Scenario: Verify postpaid recharge
Given This is postpaid recharge test


