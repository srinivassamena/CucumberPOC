Feature: Product page features

@regression
Scenario Outline: Verifying product content
Given user is on Home page
When user enter Product Category in search box "<ProductCategory>"
And user clicks on enter
And user select the "<ProductName>"
And verify Product details Warranty Information and View Return Policy links displayed



Examples:
| ProductCategory | ProductName                 | 
| Electronics     | 387-6632: Flasher-Electronic|
| Belts           | 438-7293: BEL              |