package com.jay.entity;

import org.springframework.stereotype.Component;

@Component
public class Royals implements Team {

	@Override
	public String getName() {
		return "Kansas City Royals";
	}

	@Override
	public String toString() {
		return "Royals [getName()=" + getName() + "]";
	}

}
