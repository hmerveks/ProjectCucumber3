Feature: Purchase Foreign Currency functionality

  Scenario: Login and navigate to pay bills page
    Given Navigate to website
    And Login to website username as "username" password as "password"
    And Click on
      | PayBillsButton |


  Scenario Outline: Purchase Foreign Currency functionality positive scenario

    And Click on
      | ForeignCurrencyButton |


    When User fill out "<Currency>","<Amount>","<RadioButton>"
    And Click on
      |  |
    Then "<Result>" message should be displayed


    Examples:
      | Currency | Amount  | RadioButton | Result       |
      | Merve    | Cumming | Chase       | successfully |
      | 1        | 2       | 3           | successfully |
