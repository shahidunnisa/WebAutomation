Feature: Order History Validation
@test
Scenario: Order T-Shirt and Verify the same in Order history
Given user is in the order page
When user selects the Tshirt and clicks on add to cart
And user clicks on proceed to checkout and places the order
Then Tshirt is ordered successfully and is available in order history



