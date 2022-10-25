package com.communicationMarketing.main.business.dtos;

import java.util.Date;

import javax.persistence.Id;

public class GEDDTO {
@Id
	
	private Long idGED;
	String title ;
	String description ;
	Date dateCreation;
	String Content ; 
	String ContentType ;
	
	
	public GEDDTO() {
		super();
	}
	public GEDDTO(Long idGED, String title, String description, Date dateCreation, String content, String contentType) {
		super();
		this.idGED = idGED;
		this.title = title;
		this.description = description;
		this.dateCreation = dateCreation;
		Content = content;
		ContentType = contentType;
	}
	public Long getIdGED() {
		return idGED;
	}
	public void setIdGED(Long idGED) {
		this.idGED = idGED;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	

}
