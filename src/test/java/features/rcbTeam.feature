Feature: Validating RCB Team API

Scenario: Verify that Team has only four foreign players
		Given User hit the RCB Team Mock API
		When User count the total players in Team
		Then Count the players are not from "India"
		And Total foreign players are 4
		
Scenario: Verify that Team has at least one wicket keeper
		Given User hit the RCB Team Mock API
		When User count the total players in Team
		Then Count the players are "Wicket-keeper"
		And Total Wicket-keeper are more than zero
