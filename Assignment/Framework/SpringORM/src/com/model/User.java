package com.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name="ID")
	int id;
	
	@Column(name = "UFIRSTNAME")
	String UFIRSTNAME;
	
	@Column(name = "ULASTNAME")
	String ULASTNAME;
	
	@Column(name = "UEMAIL")
	String UEMAIL;
	
	@Column(name = "UMOBILE")
	String UMOBILE;
	
	@Column(name = "UPASSWORD")
	String UPASSWORD;
	
	@Column(name = "UGENDER")
	String UGENDER;
	
	@Column(name = "UPRO_PIC")
	Blob UPRO_PIC;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUFIRSTNAME() {
		return UFIRSTNAME;
	}

	public void setUFIRSTNAME(String uFIRSTNAME) {
		UFIRSTNAME = uFIRSTNAME;
	}

	public String getULASTNAME() {
		return ULASTNAME;
	}

	public void setULASTNAME(String uLASTNAME) {
		ULASTNAME = uLASTNAME;
	}

	public String getUEMAIL() {
		return UEMAIL;
	}

	public void setUEMAIL(String uEMAIL) {
		UEMAIL = uEMAIL;
	}

	public String getUMOBILE() {
		return UMOBILE;
	}

	public void setUMOBILE(String uMOBILE) {
		UMOBILE = uMOBILE;
	}

	public String getUPASSWORD() {
		return UPASSWORD;
	}

	public void setUPASSWORD(String uPASSWORD) {
		UPASSWORD = uPASSWORD;
	}

	public String getUGENDER() {
		return UGENDER;
	}

	public void setUGENDER(String uGENDER) {
		UGENDER = uGENDER;
	}

	public Blob getUPRO_PIC() {
		return UPRO_PIC;
	}

	public void setUPRO_PIC(Blob uPRO_PIC) {
		UPRO_PIC = uPRO_PIC;
	}
}
