Feature: Testing API in Login page

  Scenario: Working with GET operation
    Given EndPoints for GET operation is "/login/mobilePhones"

  Scenario:  Working with POST operation
    Given EndPoints for POST operation is "/login/mobilePhones" and datas are "Android", "vivo" and 3
    And Working with "/login/mobilePhones" route params is "Samsung" device name
    Then Working with "/login/mobilePhones/ure" query params is "Version" is 10

  Scenario: Working with UPDATE operation
    Given EndPoints for Update operation is "/login/mobilePhones/" and datas are "IOS", "Apple15Pro", 13 and route is 2

  Scenario: Working with DELETE operation
    Given EndPoints for DELETE operation is "/login/mobilePhones/" and ID is 2