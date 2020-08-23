Feature: Add new payee functionality

  Scenario: Login and navigate to pay bills page
    Given Navigate to website
    And Login to website username as "username" password as "password"
    And Click on
      | PayBillsButton |


  Scenario Outline: Add new payee functionality positive and negative scenarios

    And Click on
      | AddNewPayeeButton |
    When User fill out "<PayeeName>","<PayeeAddress>","<Account>" and "<PayeeDetails>"
    Then "<Result>" message should be displayed


    Examples:
      | PayeeName | PayeeAddress | Account | PayeeDetails | Result       |
      | Merve     | Cumming      | Chase   | Deposit      | successfully |
      | Mina      | Alpharetta   | 3340    |              | successfully |
      | Hatice    | Johns Creek  |         | Cash         |              |
#      | Merve     | Cumming      | Chase   | Deposit      | successfully |


