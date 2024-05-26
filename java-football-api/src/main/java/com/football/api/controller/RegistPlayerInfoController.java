package com.football.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.api.dto.RegistPlayerInfoRequest;
import com.football.api.dto.RegistPlayerInfoResponse;
import com.football.api.service.RegistPlayerInfoService;

@RestController
public class RegistPlayerInfoController {

	@Autowired
	RegistPlayerInfoService registPlayerInfoService;

	@RequestMapping(value="/RegistPlayerInfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<RegistPlayerInfoResponse> execute(@RequestBody RegistPlayerInfoRequest request) {

		RegistPlayerInfoResponse response = registPlayerInfoService.doBusinessLogic(request);

		return ResponseEntity.ok(response);
	}
}
