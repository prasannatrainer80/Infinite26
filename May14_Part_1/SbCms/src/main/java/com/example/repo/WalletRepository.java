package com.example.repo;

import com.example.model.WalSource;
import com.example.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	List<Wallet> findByCusId(int cusId);
	Wallet findByCusIdAndWalSource(int cusId, WalSource walSource);
}
