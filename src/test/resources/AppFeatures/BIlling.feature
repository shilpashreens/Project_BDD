Feature: calculate billing amount

Scenario Outline: billing amount
Given user is on billing page
When user enters billing amount "<billingAmount>"
When user enters taxamount "<taxAmount>"
When user clicks on calculateAmount
Then it gives final amount "<finalAmount>"

Examples:
| billingAmount | taxAmount | finalAmount |
|1000           | 10        |1010         |
|500            | 5         |505           |
|100            | 5.5       |105.5         |
