package com.example.craftbeer.model;

public class Beer {
	
	private Long id;
	
	private Double abeverage;
	
	private Double ibu;
	
	private String name;
	
	private String style;
	
	private Double ounces;
	
	public Beer() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAbeverage() {
		return abeverage;
	}

	public void setAbeverage(Double abeverage) {
		this.abeverage = abeverage;
	}

	public Double getIbu() {
		return ibu;
	}

	public void setIbu(Double ibu) {
		this.ibu = ibu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Double getOunces() {
		return ounces;
	}

	public void setOunces(Double ounces) {
		this.ounces = ounces;
	}
	
}
