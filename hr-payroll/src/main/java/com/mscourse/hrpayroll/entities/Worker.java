package com.mscourse.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double dailyIncome;
}
