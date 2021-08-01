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
@Table(name = "customer")

@EntityListeners(AuditingEntityListener.class)
public class Customer {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id")
	    private Identification identification;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id")
	    private Details details;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id")
	    private Contact contact;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id")
	    private Roles roles;
	 
	 
	 public long getId() {
	        return id;
	    }

	  /**
	   * Sets id.
	   *
	   * @param id the id
	   */
	  public void setId(long id) {
	        this.id = id;
	    }

	public Identification getIdentification() {
		return identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
	
	
	
	  
	  
}
