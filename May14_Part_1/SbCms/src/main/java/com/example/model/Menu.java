package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Menu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {

	@Id
	private int menId;
	private String menItem;
	private double menPrice;
	private double menCalories;
	private String menSpeciality;
}
