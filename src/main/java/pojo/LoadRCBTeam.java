package pojo;

import java.util.ArrayList;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class LoadRCBTeam {

	public static String response() {

		String response = null;

		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();
		Player player6 = new Player();
		Player player7 = new Player();
		Player player8 = new Player();
		Player player9 = new Player();
		Player player10 = new Player();
		Player player11 = new Player();

		player1 = playerDetails1(player1);
		player2 = playerDetails2(player2);
		player3 = playerDetails3(player3);
		player4 = playerDetails4(player4);
		player5 = playerDetails5(player5);
		player6 = playerDetails6(player6);
		player7 = playerDetails7(player7);
		player8 = playerDetails8(player8);
		player9 = playerDetails9(player9);
		player10 = playerDetails10(player10);
		player11 = playerDetails11(player11);
		
		ArrayList<Player> playerlist = new ArrayList<Player>();
		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);
		playerlist.add(player5);
		playerlist.add(player6);
		playerlist.add(player7);
		playerlist.add(player8);
		playerlist.add(player9);
		playerlist.add(player10);
		playerlist.add(player11);

		AddTeamPlayers teams = new AddTeamPlayers();
		teams = teamRCB(teams, playerlist);

		ObjectMapper objMap = new ObjectMapper();

		try {
			response = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(teams);
			//printing the JSON Response
			System.out.println(response);

		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		return response;

	}

	public static AddTeamPlayers teamRCB(AddTeamPlayers team, ArrayList<Player> list) {
		team.setName("Royal Challengers Bangalore");
		team.setLocation("Bangalore");
		team.setPlayer(list);

		return team;
	}

	public static Player playerDetails1(Player players1) {
		players1.setName("Faf Du Plessis");
		players1.setCountry("South Africa");
		players1.setRole("Batsman");
		players1.setPrice_in_crores("7");

		return players1;
	}

	public static Player playerDetails2(Player players2) {
		players2.setName("Virat Kohli");
		players2.setCountry("India");
		players2.setRole("Batsman");
		players2.setPrice_in_crores("15");

		return players2;
	}

	public static Player playerDetails3(Player player3) {
		player3.setName("Glenn Maxwell");
		player3.setCountry("Australia");
		player3.setRole("Batsman");
		player3.setPrice_in_crores("11");

		return player3;
	}

	public static Player playerDetails4(Player player4) {
		player4.setName("Mohammad Siraj");
		player4.setCountry("India");
		player4.setRole("Bowler");
		player4.setPrice_in_crores("7");

		return player4;
	}

	public static Player playerDetails5(Player player5) {
		player5.setName("Harshal Patel");
		player5.setCountry("India");
		player5.setRole("Bowler");
		player5.setPrice_in_crores("10.75");

		return player5;
	}
	
	public static Player playerDetails6(Player player6) {
		player6.setName("Wanindu Hasaranga");
		player6.setCountry("Srilanka 	");
		player6.setRole("Bowler");
		player6.setPrice_in_crores("10.75");

		return player6;
	}

	public static Player playerDetails7(Player player7) {
		player7.setName("Dinesh Karthik");
		player7.setCountry("India");
		player7.setRole("Wicket-keeper");
		player7.setPrice_in_crores("5.5");

		return player7;
	}

	public static Player playerDetails8(Player player8) {
		player8.setName("Shahbaz Ahmed");
		player8.setCountry("India");
		player8.setRole("All-Rounder");
		player8.setPrice_in_crores("2.4");

		return player8;
	}

	public static Player playerDetails9(Player player9) {
		player9.setName("Rajat Patidar");
		player9.setCountry("India");
		player9.setRole("Batsman");
		player9.setPrice_in_crores("0.20");

		return player9;
	}

	public static Player playerDetails10(Player player10) {
		player10.setName("Josh Hazlewood");
		player10.setCountry("Australia");
		player10.setRole("Bowler");
		player10.setPrice_in_crores("7.75");

		return player10;
	}

	public static Player playerDetails11(Player player11) {
		player11.setName("Mahipal Lomror");
		player11.setCountry("India");
		player11.setRole("Bowler");
		player11.setPrice_in_crores("7.75");

		return player11;
	}

}
