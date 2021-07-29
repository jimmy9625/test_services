Feature: request register

  Scenario Outline: register user successful
    When user registers a new user
      | email   | password   |
      | <email> | <password> |
    Then check the response code <code>

    And verify response request register
      | id   | token   |
      | <id> | <token> |

    Examples:
      | email              | password | code | id | token             |
      | eve.holt@reqres.in | pistol   | 200  | 4  | QpwL5tke4Pnpja7X4 |