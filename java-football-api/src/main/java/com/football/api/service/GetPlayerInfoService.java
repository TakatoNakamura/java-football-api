package com.football.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.api.dao.PlayerInfoDao;
import com.football.api.dto.GetPlayerInfoRequest;
import com.football.api.dto.GetPlayerInfoResponse;
import com.football.api.entity.PlayerInfo;

@Service
public class GetPlayerInfoService {

	@Autowired
	PlayerInfoDao playerInfoDao;

	public GetPlayerInfoResponse doBusinessLogic(GetPlayerInfoRequest request) {

		GetPlayerInfoResponse response = new GetPlayerInfoResponse();

		// 選手情報取得
		PlayerInfo playerInfo = playerInfoDao.selectPlayerInfoByName(request.getPlayerName());

		// レスポンスに値を設定
		response.setPlayerName(playerInfo.getPlayerName());
		response.setAge(playerInfo.getAge());
		response.setCountry(playerInfo.getCountry());
		response.setCurrentClubTeam(playerInfo.getCurrentClubTeam());
		response.setDateOfBirthYear(playerInfo.getDateOfBirthYear());
		response.setDateOfBirthMonth(playerInfo.getDateOfBirthMonth());
		response.setDateOfBirthDay(playerInfo.getDateOfBirthDay());

		return response;

	}
}
