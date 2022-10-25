package com.communicationMarketing.main.business.dtos;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class EventDTO {
	@Id

	private Long idevent;
	
	private String titre;
	private String description ; 
	private Date  dateDebut ;
	private Date   dateFin ;
	
	private String type ;
	private float prix ;
	public EventDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventDTO(Long idevent, String titre, String description, Date dateDebut, Date dateFin, String type,
			float prix) {
		super();
		this.idevent = idevent;
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.type = type;
		this.prix = prix;
	}
	public Long getIdevent() {
		return idevent;
	}
	public void setIdevent(Long idevent) {
		this.idevent = idevent;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	

}
