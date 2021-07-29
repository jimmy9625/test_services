Feature:request update

  Scenario Outline:update user successful
    When User send Request  for update info user <id>
      | job   | name   |
      | <job> | <name> |
    Then check the response code <code>
    And verify response body
      | name   | job   |
      | <name> | <job> |
    Examples:
      | job           | name     | code | id |
      | zion resident | morpheus | 200  | 2  |
