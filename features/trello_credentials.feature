Feature: : Trello credential logics
    @new
    Scenario: Verified user can enter emai and password
        Given User goes to the Trello home page
        And user goes to the Sign up page
        And user clicks on login link
        When user enters email and password for verified users
            | nijatmn1@gmail.com | pass123! |
            | nijatmn2@gmail.com | pass900! |
            | ebony9@gmail.com   | pass100! |
        Then user should not see any error