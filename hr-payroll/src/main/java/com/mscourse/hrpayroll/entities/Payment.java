package com.mscourse.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private int days;
	
	public double getTotal() {
		return this.days * dailyIncome;
	}
}
