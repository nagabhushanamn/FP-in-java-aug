package com.bank.service;

import java.util.List;

import com.bank.model.Txn;
import com.bank.repository.TxnRepository;

public class TxnServiceImpl implements TxnService {

	private TxnRepository txnRepository;

	public TxnServiceImpl(TxnRepository txnRepository) {
		this.txnRepository = txnRepository;
	}

	public List<Txn> getTxns(int top) {
		List<Txn> txns = txnRepository.findAll(); // input
		//.....
		return null; // outut

	}
}
