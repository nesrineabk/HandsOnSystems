package com.communicationMarketing.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class graphicalCharter {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long graphicalCharterId;
	 private String Color ;
	 private String TexType ;
	 private String description ;
	 private String reference  ; 
	 private String FormaText ;
	 
	public graphicalCharter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public graphicalCharter(Long graphicalCharterId, String color, String texType, String description, String reference,
			String formaText) {
		super();
		this.graphicalCharterId = graphicalCharterId;
		Color = color;
		TexType = texType;
		this.description = description;
		this.reference = reference;
		FormaText = formaText;
	}

	public Long getGraphicalCharterId() {
		return graphicalCharterId;
	}

	public void setGraphicalCharterId(Long graphicalCharterId) {
		this.graphicalCharterId = graphicalCharterId;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTexType() {
		return TexType;
	}

	public void setTexType(String texType) {
		TexType = texType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getFormaText() {
		return FormaText;
	}

	public void setFormaText(String formaText) {
		FormaText = formaText;
	} 
	 
	
	
	
}
