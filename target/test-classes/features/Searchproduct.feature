Feature: Search the place the orders for products

Scenario Outline: Search experience for product search in both home and offers page

Given user is on GreenKart landing page
When user searched with shortname <Name> and extract the actuall name of product
Then user searched for <Name> shortname in offers page 
And validate product name in offers page matches with landing page

Examples:
|Name|
|Tom|
|Beet|