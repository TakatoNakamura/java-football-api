package com.football.api.dto;

import lombok.Data;

/**
 * 選手情報登録APIリクエスト
 * @author takato
 *
 */
@Data
public class RegistPlayerInfoRequest {

	/**
	 * 選手名
	 */
	private String playerName;

	/**
	 * 年齢
	 */
	private int age;

	/**
	 * 国
	 */
	private String country;

	/**
	 * 所属チーム
	 */
	private String currentClubTeam;

	/**
	 * 生年月日(年)
	 */
	private String dateOfBirthYear;

	/**
	 * 生年月日(月)
	 */
	private String dateOfBirthMonth;

	/**
	 * 生年月日(日)
	 */
	private String dateOfBirthDay;
}
