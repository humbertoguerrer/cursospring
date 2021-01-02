package com.nelioalves.cursospring.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelioalves.cursospring.services.DBService;

@Configuration
@Profile("teste")
public class TesteConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instatiateDatabase() throws ParseException {
		dbService.instantiateTesteDatabase();
		return true;
	}
}
