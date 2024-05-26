package com.football.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.api.dao.PlayerInfoDao;
import com.football.api.dto.UpdatePlayerInfoRequest;
import com.football.api.dto.UpdatePlayerInfoResponse;

@Service
public class UpdatePlayerInfoService {

	@Autowired
	PlayerInfoDao playerInfoDao;

	public UpdatePlayerInfoResponse doBusinessLogic(UpdatePlayerInfoRequest request) {

		UpdatePlayerInfoResponse response = new UpdatePlayerInfoResponse();

		playerInfoDao.updatePlayerInfoByName(request.getPlayerName(), request.getTransferClubTeam());

		response.setResultMessage("更新完了");

		return response;
	}
}
