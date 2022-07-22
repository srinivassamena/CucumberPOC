Feature: Home page features

@smoke
Scenario: Home page title
Given user is on Home page
When user gets the title of the page
Then page title should be "Cat® Parts Store – Order Genuine Parts & Tools from Caterpillar"

@regression
Scenario: User search for Cat Parts
Given user is on Home page
When user enter Cat part in search box "Electronics"
And user clicks on enter
Then user gets the title of the page
And page title should be "Search Results"  