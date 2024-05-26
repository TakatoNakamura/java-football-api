package com.football.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.api.dto.DeletePlayerInfoRequest;
import com.football.api.dto.DeletePlayerInfoResponse;
import com.football.api.service.DeletePlayerInfoService;

@RestController
public class DeletePlayerInfoController {

	@Autowired
	DeletePlayerInfoService deletePlayerInfoService;

	@RequestMapping(value="/DeletePlayerInfo", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<DeletePlayerInfoResponse> execute(@RequestBody DeletePlayerInfoRequest request) {

		DeletePlayerInfoResponse response = deletePlayerInfoService.doBusinessLogic(request);

		return ResponseEntity.ok(response);

	}
}
