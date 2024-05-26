package com.football.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.api.dao.PlayerInfoDao;
import com.football.api.dto.DeletePlayerInfoRequest;
import com.football.api.dto.DeletePlayerInfoResponse;

@Service
public class DeletePlayerInfoService {

	@Autowired
	PlayerInfoDao playerInfoDao;

	public DeletePlayerInfoResponse doBusinessLogic(DeletePlayerInfoRequest request) {

		DeletePlayerInfoResponse response = new DeletePlayerInfoResponse();

		playerInfoDao.deletePlayerInfo(request.getPlayerName());

		response.setPlayerName(request.getPlayerName());
		response.setResultMessage("現役引退しました");

		return response;
	}
}
