Feature: Test Add to Cart functionality

  Background: Preconditions
    Given Open Amazon page

    Scenario: Test Add to Cart functionality
      Then Click All button and select Electronics then Office Electronics
      Then Search for mini desk vacuum
      Then Select the first product and Add To Cart
      Then We check the cart
      Then We modify the quantity

