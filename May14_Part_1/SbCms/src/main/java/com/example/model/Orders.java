package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name="Orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
	
	@Id
	private int ordId;
	private int cusId;
	private int venId;
	private String walSource;
	private int menId;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	private String ordStatus;
	private String ordComments;
}
