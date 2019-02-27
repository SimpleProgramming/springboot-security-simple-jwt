package com.app.springboot.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.model.ApiToken;
import com.app.springboot.model.Client;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/login")
public class LoginController {

	@PostMapping
	public ResponseEntity<ApiToken> login(@RequestBody Client client) {
		return new ResponseEntity<>(
				new ApiToken(Jwts.builder().setSubject(client.getClientName()).claim("roles", "user")
						.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "123#&*zcvAWEE999").compact()),
				HttpStatus.OK);
	}
}