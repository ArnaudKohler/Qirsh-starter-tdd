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

Scenario: When facing Weast

Given A rover with position (x=0, y=0) facing Weast
When rover goes forward
Then The Rover position is (x=-1, y=0) facing Weast


Feature: Moving backward

Scenario: Moving backward when facing North

Given A rover with position (x=0, y=0) facing North
When rover goes backward
Then The Rover psoition is (x=0, y=-1) facing North