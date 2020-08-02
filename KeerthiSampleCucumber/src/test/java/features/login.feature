Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login" Site
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
And close browsers

Examples:
|username			|password	|
|opensourcecms	|opensourcecms	|






