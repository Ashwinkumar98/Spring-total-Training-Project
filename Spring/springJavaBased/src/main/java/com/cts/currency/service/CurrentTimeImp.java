package com.cts.currency.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class CurrentTimeImp implements CurrentTimeService {

	public LocalDate getTime() {
		
		return LocalDate.now();
	}

}
