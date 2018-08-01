package com.bank.model;

import java.time.LocalDate;

public class Txn {

	private int id;
	private double amount;
	private LocalDate date;
	private TxnType type;

	public Txn(int id, double amount, LocalDate date, TxnType type) {
		super();
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Txn [id=" + id + ", amount=" + amount + ", date=" + date + ", type=" + type + "]";
	}
	
	

}
