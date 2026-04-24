package com.example.controller;

import java.util.List;

import com.example.model.WalSource;
import com.example.model.Wallet;
import com.example.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/showCustomerWallets/{cusId}")
	public List<Wallet> showCustomerWallets(@PathVariable int cusId) {
		return walletService.showCustomerWallets(cusId);
	}
	
	@GetMapping(value="/showCustomerWalletInfo/{cusId}/{walSource}")
	public Wallet showCustomerWalletInfo(int cusId, WalSource walSource) {
		return walletService.showCustomerWalletInfo(cusId, walSource);
	}

	@GetMapping(value="/showByWalletId/{walletId}")
	public Wallet searchByWalletId(@PathVariable int walletId) {
		return walletService.showByWalletId(walletId);
	}
}
