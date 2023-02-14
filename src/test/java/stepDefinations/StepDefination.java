package stepDefinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import mockAPI.TeamRCB;
import pojo.LoadRCBTeam;

public class StepDefination {

	String response = null;
	JsonPath js = null;
	String pCountry = null;
	String pRole = null;
	int countryCount = 0;
	int roleCount = 0;
	int size = 0;

	@Given("User hit the RCB Team Mock API")
	public void user_hit_the_rcb_team_mock_api() {
		LoadRCBTeam team = new LoadRCBTeam();
		response = team.response();
	}

	@When("User count the total players in Team")
	public void User_count_the_total_players_in_Team() {
		js = new JsonPath(response);
		size = js.getInt("player.size()");
	}

	@Then("Count the players are not from {string}")
	public void count_the_players_are_not_from(String key) {
		for (int i = 0; i < size; i++) {
			pCountry = js.getString("player[" + i + "].country");
			if (!pCountry.equals(key))
				countryCount++;
		}
	}

	@Then("Total foreign players are {int}")
	public void total_foreign_players_are(Integer number) {

		assertEquals(countryCount, number.intValue());
		System.out.println("Total no. of Foreign players is : " + countryCount);
	}

	@Then("Count the players are {string}")
	public void count_the_players_are(String key) {
		for (int i = 0; i < size; i++) {
			pRole = js.getString("player[" + i + "].role");
			if (pRole.equals(key))
				roleCount++;
		}
	}

	@Then("Total Wicket-keeper are more than zero")
	public void total_wicket_keeper_are_more_than_zero() {

		assertTrue("No wicket keeper is in the Team", roleCount > 0);
		System.out.println("Total no. of Wicket-keeper is : " + roleCount);
	}

}
