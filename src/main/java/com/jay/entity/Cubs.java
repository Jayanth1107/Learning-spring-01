package com.jay.entity;

import org.springframework.stereotype.Component;

@Component
public class Cubs implements Team{

	@Override
	public String getName() {
		return "Chicago Cubs";
	}

	@Override
	public String toString() {
		return "Cubs [getName()=" + getName() + "]";
	}
}
