package com.football.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.api.dto.UpdatePlayerInfoRequest;
import com.football.api.dto.UpdatePlayerInfoResponse;
import com.football.api.service.UpdatePlayerInfoService;

@RestController
public class UpdatePlayerInfoController {

	@Autowired
	UpdatePlayerInfoService updatePlayerInfoService;

	@RequestMapping(value="/UpdatePlayerInfo", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<UpdatePlayerInfoResponse> execute(@RequestBody UpdatePlayerInfoRequest request) {

		UpdatePlayerInfoResponse response = updatePlayerInfoService.doBusinessLogic(request);

		return ResponseEntity.ok(response);

	}
}
