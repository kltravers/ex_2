package org.test.sample_spring_app.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.sample_spring_app.common.EquationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/testmap")
public class testController {

	@RequestMapping(value = "/getequation", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(httpMethod = "GET", value = "End point to trigger replication of an AU for a given version", notes = "", response = EquationResponse.class, produces = "application/json")
	public ResponseEntity<EquationResponse> getEquation(@RequestParam("cu count") String cuCount, @RequestParam("au count") String auCount, @RequestParam("file size") String fileSize) {

		String equation = "AuCount: " + auCount + " x FileSize: " + fileSize + " x CuCount: " + cuCount;
		int answer = Integer.valueOf(auCount) * Integer.valueOf(cuCount) * Integer.valueOf(fileSize);
		
		EquationResponse response = new EquationResponse(equation, answer);
		return new ResponseEntity<EquationResponse>(response, HttpStatus.OK);

	}
	
}
