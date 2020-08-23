Feature: Purchase Foreign Currency functionality

  Scenario: Login and navigate to pay bills page
    Given Navigate to website
    And Login to website username as "username" password as "password"
    And Click on
      | PayBillsButton |


  Scenario Outline: Purchase Foreign Currency functionality positive scenario

    And Click on
      | ForeignCurrencyButton |
      | CurrencyDropdown      |


    When User fill out "<Currency>","<Amount>","<RadioButton>"

    And Click on
      | PurchaseButton |
    Then "<Result>" message should be displayed


    Examples:
      | Currency    | Amount | RadioButton         | Result       |
      | AUD         | 1000   | USDollarRadioButton | successfully |
      | Japan (yen) | 10     | SelectedRadioButton | successfully |
