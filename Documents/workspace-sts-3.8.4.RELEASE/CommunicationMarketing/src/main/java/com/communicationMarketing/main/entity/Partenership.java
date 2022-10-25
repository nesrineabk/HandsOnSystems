package com.communicationMarketing.main.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Partenership")

public class Partenership {
	 @Id
	
	   private Long PartenershipId;
	 
	 
	 private String PartenershipName ;
	 private String PartenershipLogo ;
	 private String PartenershipDomain;
	 private String PartenershipWebSiteLink;
	 private String PartenershipEmail ;
	 private Integer  PartenershipPhone ;
	 private String PartenershipLinkedin ;
	public Partenership() {
		super();

	}
	public Partenership(Long partenershipId, String partenershipName, String partenershipLogo,
			String partenershipDomain, String partenershipWebSiteLink, String partenershipEmail,
			Integer partenershipPhone, String partenershipLinkedin) {
		super();
		PartenershipId = partenershipId;
		PartenershipName = partenershipName;
		PartenershipLogo = partenershipLogo;
		PartenershipDomain = partenershipDomain;
		PartenershipWebSiteLink = partenershipWebSiteLink;
		PartenershipEmail = partenershipEmail;
		PartenershipPhone = partenershipPhone;
		PartenershipLinkedin = partenershipLinkedin;
	}
	public Long getPartenershipId() {
		return PartenershipId;
	}
	public void setPartenershipId(Long partenershipId) {
		PartenershipId = partenershipId;
	}
	public String getPartenershipName() {
		return PartenershipName;
	}
	public void setPartenershipName(String partenershipName) {
		PartenershipName = partenershipName;
	}
	public String getPartenershipLogo() {
		return PartenershipLogo;
	}
	public void setPartenershipLogo(String partenershipLogo) {
		PartenershipLogo = partenershipLogo;
	}
	public String getPartenershipDomain() {
		return PartenershipDomain;
	}
	public void setPartenershipDomain(String partenershipDomain) {
		PartenershipDomain = partenershipDomain;
	}
	public String getPartenershipWebSiteLink() {
		return PartenershipWebSiteLink;
	}
	public void setPartenershipWebSiteLink(String partenershipWebSiteLink) {
		PartenershipWebSiteLink = partenershipWebSiteLink;
	}
	public String getPartenershipEmail() {
		return PartenershipEmail;
	}
	public void setPartenershipEmail(String partenershipEmail) {
		PartenershipEmail = partenershipEmail;
	}
	public Integer getPartenershipPhone() {
		return PartenershipPhone;
	}
	public void setPartenershipPhone(Integer partenershipPhone) {
		PartenershipPhone = partenershipPhone;
	}
	public String getPartenershipLinkedin() {
		return PartenershipLinkedin;
	}
	public void setPartenershipLinkedin(String partenershipLinkedin) {
		PartenershipLinkedin = partenershipLinkedin;
	}
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	 
}
