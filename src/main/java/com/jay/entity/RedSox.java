package com.jay.entity;

import org.springframework.stereotype.Component;

@Component
public class RedSox implements Team{

	@Override
	public String getName() {
		return "Boston RedSox";
	}

	@Override
	public String toString() {
		return "RedSox [getName()=" + getName() + "]";
	}
	

}
