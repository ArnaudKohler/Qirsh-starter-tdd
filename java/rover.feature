Feature: Moving forward

Scenario: When facing North

Given A rover with position (x=0, y=0) facing North
When rover goes forward
Then The Rover position is (x=0, y=1) facing North

Scenario: When facing East

Given A rover with position (x=0, y=0) facing East
When rover goes forward
Then The Rover position is (x=1, y=0) facing East

Scenario: When facing South

Given A rover with position (x=0, y=0) facing South
When rover goes forward
Then The Rover position is (x=0, y=-1) facing South

Scenario: When facing West

Given A rover with position (x=0, y=0) facing West
When rover goes forward
Then The Rover position is (x=-1, y=0) facing West


Feature: Moving backward

Scenario: When facing North

Given A rover with position (x=0, y=0) facing North
When rover goes backward
Then The Rover psoition is (x=0, y=-1) facing North

Scenario: When facing South

Given A rover with position (x=0, y=0) facing South
When rover goes backward
Then The Rover psoition is (x=0, y=1) facing South

Scenario: When facing West

Given A rover with position (x=0, y=0) facing West
When rover goes backward
Then The Rover psoition is (x=1, y=0) facing West

Scenario: When facing East

Given A rover with position (x=0, y=0) facing East
When rover goes backward
Then The Rover psoition is (x=-1, y=0) facing East


Feature: Turning Right

Scenario: When facing North

Given A rover facing North
When rover turn right
Then The Rover is now facing East

Scenario: When facing East

Given A rover facing East
When rover turn right
Then The Rover is now facing South

Scenario: When facing South

Given A rover facing South
When rover turn right
Then The Rover is now facing West

Scenario: When facing West

Given A rover facing West
When rover turn right
Then The Rover is now facing North


Feature: Turning Left

Scenario: When facing North

Given A rover facing North
When rover turn right
Then The Rover is now facing West

Scenario: When facing East

Given A rover facing East
When rover turn right
Then The Rover is now facing North

Scenario: When facing South

Given A rover facing South
When rover turn right
Then The Rover is now facing East

Scenario: When facing West

Given A rover facing West
When rover turn right
Then The Rover is now facing South