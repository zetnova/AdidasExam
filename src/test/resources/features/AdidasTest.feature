Feature:
  @Test1
  Scenario: API Get available pets from the list
    Given set api endpoint
    When get available pets
    Then Assert response code
    Then Assert expected result

  @Test2
  Scenario: API Add new pet in the list
    Given set api endpoint
    When Post a new available pet to the store
    Then Assert response code
    Then Assert new pet added

  @Test3
  Scenario: API Update pet in the list
    Given set api endpoint
    When Update this pet status to sold
    Then Assert response code
    Then Assert status updated

    @Test4
    Scenario: API Delete pet from the list
    Given set api endpoint
    When Delete this pet
    Then Assert response code
    Then Assert deletion

    @Test5
    Scenario: UI Navigate through product categories
      Given open demoblaze.com
      When Customer navigate to phone category
      Then check products in Phone category are shown
      And navigate to Laptops category
      And check products in Laptops category are shown
      And navigate to Monitors category
      And check products in Monitors category are shown
      And Close demoblaza.com

   @Test6
    Scenario: UI Add to cart and purchase
     Given open demoblaze.com
     When Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation
     And  Navigate to Laptop → Dell i7 8gb and click on Add to cart. Accept pop up confirmation
     And Navigate to Cart → Delete Dell i7 8gb from cart
     And Click on Place order
     And Fill in all web form fields
     And Click on Purchase
     And Capture and log purchase Id and Amount
     Then Assert purchase amount equals expected
     And click on OK







