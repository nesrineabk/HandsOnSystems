package com.communicationMarketing.main.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Document(collection = "GED")
public class GED    {
	
	@Id
	private Long idGED;
	private String title ;
	private String description ;
	private Date dateCreation;
	private String Content ; 
	private String ContentType ;
	
	
	public GED() {
		super();
	}
	public GED(Long idGED, String title, String description, Date dateCreation, String content, String contentType) {
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
