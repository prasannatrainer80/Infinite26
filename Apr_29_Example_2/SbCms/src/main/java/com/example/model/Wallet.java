package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Wallet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

	@Id
	private int walId;
	private int cusId;
	private double walAmount;
    @Enumerated(EnumType.STRING)  // Save as String (preferred)
	private WalSource walSource;

}
