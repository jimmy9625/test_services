Feature:  request find single User

  Scenario Outline: user search successful
    When user search user <id>
    Then check the response code <code>
    And verify user information
      | first_name   | email   | last_name   | avatar   | id   |
      | <first_name> | <email> | <last_name> | <avatar> | <id> |

    Examples:
      | id | code | first_name | email                  | first_name | last_name | avatar                                  |
      | 2  | 200  | Janet      | janet.weaver@reqres.in | Janet      | Weaver    | https://reqres.in/img/faces/2-image.jpg |

  Scenario Outline: user no found
    When user search user <id>
    Then check the response code <code>
    Examples:
      | id | code |
      | 88 | 404  |



