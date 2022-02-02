Feature: Login Functionality
Background: User is successfully logged in
Given user open "Chrome" browser with exe
Given user open url as

@SmokeTest
Scenario: Login Functionality with valid credentials
When user click on cancel button
When user move on Login DropDown
When user click on My Profile
When user enter "9970357376" as username
When user enter "kailas1234" as password
When user click on Login button
Then Application shows user profile to user