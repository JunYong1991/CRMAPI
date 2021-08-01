package com.example.crmPackage.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "details")

@EntityListeners(AuditingEntityListener.class)
public class Details {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "displayName", nullable = false)
    private String displayName;
    
    @Column(name = "gender", nullable = false)
    private String gender;
    
    @Column(name = "dateOfBirth", nullable = false)
    private String dob;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "nationality", nullable = false)
    private String nationality;
    
    @Column(name = "race", nullable = false)
    private String race;
    
    @Column(name = "address", nullable = false)
    private long address;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address")
//    private Address addressDetail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public long getAddress() {
		return address;
	}

	public void setAddress(long address) {
		this.address = address;
	}
    
    
}

    
