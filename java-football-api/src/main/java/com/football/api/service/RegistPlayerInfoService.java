package com.football.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.api.dao.PlayerInfoDao;
import com.football.api.dto.RegistPlayerInfoRequest;
import com.football.api.dto.RegistPlayerInfoResponse;
import com.football.api.entity.PlayerInfo;


@Service
public class RegistPlayerInfoService {

	@Autowired
	PlayerInfoDao playerInfoDao;

	public RegistPlayerInfoResponse doBusinessLogic(RegistPlayerInfoRequest request) {

		RegistPlayerInfoResponse response = new RegistPlayerInfoResponse();

		PlayerInfo playerInfo = new PlayerInfo();

		playerInfo.setPlayerName(request.getPlayerName());
		playerInfo.setAge(request.getAge());
		playerInfo.setCountry(request.getCountry());
		playerInfo.setCurrentClubTeam(request.getCurrentClubTeam());
		playerInfo.setDateOfBirthYear(request.getDateOfBirthYear());
		playerInfo.setDateOfBirthMonth(request.getDateOfBirthMonth());
		playerInfo.setDateOfBirthDay(request.getDateOfBirthDay());

		// 選手情報登録
		playerInfoDao.insertPlayerInfo(playerInfo);

		response.setResultMessage("登録完了");

		return response;

	}
}
