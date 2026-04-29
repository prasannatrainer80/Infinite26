package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Vendor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vendor {

	@Id
	private int venId;
	private String venName;
	private String venPhnNo;
	private String venUsername;
	private String venPassword;
	private String venEmail;
}
