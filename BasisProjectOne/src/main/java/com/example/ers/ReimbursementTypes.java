package com.example.ers;

public enum ReimbursementTypes {
	LODGING(1), TRAVEL(2), FOOD(3), OTHER(4);

	private final int type;

	private ReimbursementTypes(int type){this.type = type;}

	public int getValue() {
		return type;
	}
}
