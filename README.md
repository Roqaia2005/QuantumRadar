You will find the code in the master branch

Steps to enhance the my initial design 

Initial Design was have issues but step by step i reach the final one now <img width="1200" height="1599" alt="WhatsApp Image 2026-07-23 at 4 23 41 PM" src="https://github.com/user-attachments/assets/78bdf44d-4aea-4e85-87fa-3029a2bba7eb" />

Radar
Observation
(plateNumber
date
carType
speed
seatbeltStatus)

First Enhancement:
Added Rule
(description
fee)
Second Enhancement
Split Rule into:
(SpeedRule
carType
speedLimit)
 and 
SeatBeltRule 

Third Enhancement:
Added Violation

first i didnot add rule name but next i realized that it was important ot cacluate total violated rules in a map
(ruleName
message
fee)

Fourth Enhancement:
Added Fine
plateNumber
violations
totalAmount


Final Design
Radar
List<Rule>
List<Fine>

Observation
plateNumber
date
carType
speed
seatbeltFastened
List<Violation>

Rule (abstract) i decided to make it abstract so we can add any rules in the future without editing main logic
description
fee

SpeedRule
carType
speedLimit

SeatBeltRule
Violation
ruleName
message
fee
Fine
plateNumber
List<Violation>
totalAmount

I try as much to make the desgin extensible and simple while satisfying the requirements 

thanks 

Roqaia Hassan 
