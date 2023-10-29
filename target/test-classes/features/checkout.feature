Feature: Place the orders for products

Scenario Outline: Search experience for product search in both home and offers page

Given user is on GreenKart landing page
When user searched with shortname <Name> and extract the actuall name of product
And added "3" items of the selected product to cart
Then user proceeds to checkout and validate <Name> items in the checkout page
And verify user has the ability to enter promo code and place the order

Examples:
|Name|
|Tom|
|Beet|