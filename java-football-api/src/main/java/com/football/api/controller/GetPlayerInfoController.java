package com.football.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.api.dto.GetPlayerInfoRequest;
import com.football.api.dto.GetPlayerInfoResponse;
import com.football.api.service.GetPlayerInfoService;

@RestController
public class GetPlayerInfoController {

	@Autowired
	GetPlayerInfoService getPlayerInfoService;

	@RequestMapping(value="/GetPlayerInfo", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<GetPlayerInfoResponse> execute(@RequestBody GetPlayerInfoRequest request) {

		GetPlayerInfoResponse response = getPlayerInfoService.doBusinessLogic(request);

		return ResponseEntity.ok(response);
	}
}
