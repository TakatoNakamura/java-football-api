package com.football.api.dto;

import lombok.Data;

@Data
public class UpdatePlayerInfoRequest {

	/**
	 * 選手名
	 */
	private String playerName;

	/**
	 * 移籍先クラブチーム
	 */
	private String transferClubTeam;
}
