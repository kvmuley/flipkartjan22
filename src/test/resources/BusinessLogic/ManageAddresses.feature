Feature: Manage Addresses Functionality
Background: User is successfully logged in
Given user open "Chrome" browser with exe
Given user open url as
Given user click on cancel button
Given user move on Login DropDown
Given user click on My Profile
Given user enter "9970357376" as username
Given user enter "kailas1234" as password
Given user click on Login button

@SmokeTest
Scenario: Manage Addresses Functionality with valid data
When user move on manage address button
When user click on manage addresses
When user click on Add a new address
When user enetr "Kailas Muley" as name
When user enter "7972982151" as mobile number
When user enter "414001" as Pincode
When user enter "balikashram road" as locality
When user enter "sudake mala" as address
When user select address type as home
When user click on save button
Then application shows new address added successfully