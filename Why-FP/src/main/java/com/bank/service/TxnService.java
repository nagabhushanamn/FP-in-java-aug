package com.bank.service;

import java.util.List;

import com.bank.model.Txn;

public interface TxnService {

	List<Txn> getTxns(int top);
	
}
